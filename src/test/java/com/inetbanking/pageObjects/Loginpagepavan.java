package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;



public class Loginpagepavan extends BasePage1 {

	
	public  Loginpagepavan (WebDriver driver) {
		
	         	super(driver);
	}
	
	//locator
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement  txtemailaddress;
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy (xpath = "//input[@type='submit']")
	WebElement loginbutton;
	
	
	
	//action methods
	
	public void setemail(String email) {
		wait.until(ExpectedConditions.visibilityOf( txtemailaddress));
		txtemailaddress.sendKeys( email);
	}
	
	public void setpassword(String pwd) {
		wait.until(ExpectedConditions.visibilityOf(txtpassword));
		txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(loginbutton));
		
		loginbutton.click();
		
	}
	
	
	
	
}
