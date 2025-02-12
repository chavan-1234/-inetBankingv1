package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaChangepwdpage extends BasePage1{
	
	public  QaChangepwdpage(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement connpassword;
	
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement continuebttn;
	
	//method
	public void enterpass(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterconfirmpass(String passcon) {
		password.sendKeys(passcon);
	}
	public void clickcontinuebtn() {
		continuebttn.click();
	}
}
