package com.inetbanking.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class QaLoginpage extends BasePage1{
	
         public QaLoginpage(WebDriver driver) {
        	 super(driver);
        	 
         }
         
         //loginpage locatar
         
         @FindBy(xpath = "//input[@id='input-email']")
         WebElement emailfield;
         
         @FindBy(xpath = "//input[@id='input-password']")
         WebElement pwdfield;
         
         @FindBy(xpath = "//input[@value='Login']")
         WebElement loginbutton;
         
         @FindBy(xpath = "//a[text()='Continue']")
         WebElement continuefield ;
         
         @FindBy(xpath = "//ul[@class='breadcrumb']/child::li/descendant::a[text()='Login']")
         WebElement loginbreadcrump;
         @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
         WebElement warningmsg;
         
         @FindBy(xpath = "//input[@type='password']/following-sibling::a[text()='Forgotten Password']")
         WebElement forgotlink;
         
         @FindBy(xpath = "//div[@class='list-group']/descendant::a[text()='My Account']")
         WebElement myaccright;
         
         // action methods
         
         public String getcopytextintoemialfield() {
        	return emailfield.getAttribute("value");
        	 
         }
         
         public WebDriver pastecopytextpwdfieldintoemailfield(WebDriver driver) {
        	 Actions act=new Actions(driver);
        	 act.click( emailfield).keyDown(Keys.CONTROL)
        	. sendKeys("v").keyUp(Keys.CONTROL);
        	 
        	 return driver;
        	 
        	 
         }
         
         public WebDriver copyingpwdfieldtext(WebDriver driver) {
        	 
        	 Actions act=new Actions(driver);
        	 act.doubleClick(pwdfield).keyDown(Keys.CONTROL)
        	 .sendKeys("c").keyUp(Keys.CONTROL);
        	 return driver;
        	 
         }
         
         public String getpwdfiledtype() {
        	return pwdfield.getAttribute("type");
         }
         
         public void clickrightmyacc() {
        	 myaccright.click();
         }
         public String getemailplaceholder() {
        	  return emailfield.getAttribute("placeholder");
        	 
         }
         public String getpwdplaceholder() {
        	return pwdfield.getAttribute("placeholder");
         }
         
         public void clickonforgotpwd() {
        	 forgotlink.click();
         }
         
         
         public boolean availablepwdlink () {
            return forgotlink.isDisplayed();
        	 
         }
         
         public void enterEmail(String email) {
        	 emailfield.sendKeys(email); 
         }
         
         public void enterPassword(String pwd) {
        	 pwdfield.sendKeys(pwd);
         }
         
         public void clicklogin() {
        	 loginbutton.click();
        	 
         }
         
         public void clickcontinue() {
        	 continuefield.click();
         }
         
         public boolean didnavigateloginpage() {
        	 return   loginbreadcrump.isDisplayed();
        	 
         }
         public String    getwrningmsg() {
        	return warningmsg.getText();
        	 
         }
         
         public void clearpwd() {
        	 pwdfield.clear();
        	 
         }

		

		

		
         
         
}
