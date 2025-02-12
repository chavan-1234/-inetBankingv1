package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginpageSwaglabs1 extends BasePage1 {
  
	
	//1 constructor
	//2 locator
	//3 action method
	
	//contructor 
	public LoginpageSwaglabs1(WebDriver driver){
		
		super(driver);
		
	}
	
	//locator
	
	    @FindBy(xpath="//input[@id='user-name']")
	    WebElement username;
	    
	    @FindBy(xpath="//input[@id='password']")
	    WebElement password;
	    
	    @FindBy(xpath = "//input[@id='login-button']")
	    WebElement loginbutton;
	    
	    
	    //action method 
	    
	public void setusername(String un) {
	    	username.sendKeys(un);
	    }
	    
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	
	public void clickloginbtn() throws InterruptedException {
		Thread.sleep(4000);
		loginbutton.click();
	}
	    
	   
	
	
	
}
