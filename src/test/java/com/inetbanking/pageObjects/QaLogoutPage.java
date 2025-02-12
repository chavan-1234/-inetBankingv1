package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaLogoutPage extends BasePage1 {
           
	 public  QaLogoutPage (WebDriver driver){
		super(driver);
		
	}
	 
	 @FindBy(linkText = "Continue")
	 WebElement continuebtn;
	 
	 @FindBy(xpath = "//span[text()='My Account']")
	 WebElement myacc;
	 
	 @FindBy(linkText = "Login")
	 WebElement login;
	 
	 public void clickcontinuebtn() {
		 continuebtn.click();
		 
	 }
	 public void clickmyacc() {
		 myacc.click();
	 }
		
	 public void clicklogin() {
		 login.click();
	 }
	 
}
