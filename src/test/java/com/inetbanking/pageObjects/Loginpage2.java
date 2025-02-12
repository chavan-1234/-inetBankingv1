package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage2 extends BasePage1{

	
	 public Loginpage2(WebDriver driver) {
		 super(driver);
	 }
	 
	 
	 @FindBy(xpath = "//input[@id='input-email']")
	 WebElement emailadd;
	 
	 @FindBy(xpath = "//input[@id='input-password']")
	 WebElement pwd;
	 
	 
	 @FindBy(xpath ="//input[@type='submit']" )
	 WebElement loginbtn;
	 
	 public void setemil(String emailadd1) {
		 emailadd.sendKeys(emailadd1);
	 }
	
	 public void setpwd(String pass) {
		 pwd.sendKeys(pass);
	 }
	
	public void clicklogin() {
		loginbtn.click();
	}
}
