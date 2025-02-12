package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registerpage2 extends BasePage1{

	
	public Registerpage2 (WebDriver driver) {
		super(driver);
		
	}
	
	//locator
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
       WebElement email;
	
	
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement telephone;
	
	
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtpass;	//input[@id='input-password']
	
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtconfirmpass;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement txtcheckbox;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitbtn;
	
	@FindBy(xpath = "//div[@id='contain']/h1")
	WebElement msgconfirmbtn;
	
	
	
	//methods
	
	public void setusername(String username) {
		firstname.sendKeys(username);
	}

	public void setpassword( String pwd) {
	js.executeScript("arguments[0].value='pwd'", lastname)	;
	}
	
	public void setemail(String email1) {
		email.sendKeys(email1);
		
	}
	
	public void settele(String tele) {
		 telephone.sendKeys(tele);
	}
	
	public void setpass(String pass) {
		 txtpass.sendKeys(pass);
	}
	
	public void setconpass(String pass2) {
		txtconfirmpass.sendKeys(pass2);
	}
	
	public void checkbox() {
		
	js.executeScript("arguments[0].click()",txtcheckbox );	
	}
	
	public void clicksubmit() {
		submitbtn.click();
	}
	
	public String getconfirmmsg() {
		try {
		return	msgconfirmbtn.getText();
			
		}
		catch (Exception e) {
			return e.getMessage();
			
		}
	}
	
	
}
