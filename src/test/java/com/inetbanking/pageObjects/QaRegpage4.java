package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaRegpage4 {
      
	 public static WebDriver driver;
	  
       public 	QaRegpage4(WebDriver driver) {
    	    this.driver=driver;
    	    PageFactory.initElements(driver, this);
    	    
    	    
       }
       
       //locator
       
       @FindBy(xpath = "//span[text()='My Account']")
 	  WebElement myacc;
 	   @FindBy(xpath = "//a[text()='Register']")
 	  WebElement reg;
 	  @FindBy(xpath = "//input[@id='input-firstname']")
 	  WebElement firstname;
 	  @FindBy(xpath = "//input[@id='input-lastname']")
 	  WebElement lastname;
 	  @FindBy(xpath = "//input[@id='input-email']")
 	  WebElement email;
 	  @FindBy(xpath = "//input[@id='input-telephone']")
 	  WebElement telephone;
 	  @FindBy(xpath = "//input[@id='input-password']")
 	  WebElement password;
 	  @FindBy(xpath = "//input[@id='input-confirm']")
 	  WebElement confirmpass;
 	  @FindBy(xpath = "//input[@id='//input[@type='checkbox']")
 	  WebElement checkbox;
 	  @FindBy(xpath = "//input[@type='submit']")
 	  WebElement confirmbtn;
 	  
 	  @FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
 	  WebElement ferror;
 	 @FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
 	  WebElement lerror;
 	 @FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
 	  WebElement eerror;
 	 @FindBy(xpath = "//input[@id='input-telephone']/following-sibling::div")
 	  WebElement terror;
 	 @FindBy(xpath ="//input[@id='input-password']/following-sibling::div")
 	  WebElement perror;
 	 @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
 	  WebElement privacyerror;
       
       //action method
 	 public void myacc() {
		  myacc.click();
	  }
	  public void register() {
		  reg.click();
	  }
	  
	  public void firstname(String name) {
		  firstname.sendKeys(name);
	  }

	  public void lastname(String ln) {
		  lastname.sendKeys(ln);
	  }

	  public void email(String eml) {
		  email.sendKeys(eml);
	  }

	  public void telephone(String tele) {
		  telephone.sendKeys(tele);
	  }

	  public void password(String pwd) {
		 password.sendKeys(pwd); 
	  }

	  public void confirmpass(String con) {
		  confirmpass.sendKeys(con);
	  }
	  
	  public void checkbox() {
		  checkbox.click();;
	  }
	  
	  public void confirmbtn() {
		  confirmbtn.click();
	  }
	  
	  public String ferror() {
		  return ferror.getText();
		  
	  }
	  
	  public String lerror() {
		  return lerror.getText();
		  
	  }
	  public String emailerror() {
		  return eerror.getText();
		  
	  }
	  
	  public String teleerror() {
		  return  terror.getText();
		  
	  }
	  public String pwderror() {
		  return perror .getText();
		  
	  }
	  public String privacyerror() {
		  return  privacyerror.getText();
		  
	  }
	  
	  
	  
	  
	  
	  
	  
}
