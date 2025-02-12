package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {     //cons , locator, methods
	 
	 WebDriver driver;
	 
	      public LoginPage1 (WebDriver driver)    {
	    	  
	    	       this. driver   = driver;
	    	       
	    	       PageFactory.initElements(driver, this);
	    	  
	      }
	        
	      @FindBy(xpath="//input[@placeholder='Username']")
	      
	       WebElement txt_username; 
	      
	      @ FindBy(xpath="//input[@placeholder='Password']")
	      
	      WebElement txt_password;
	
	       @FindBy(xpath="//button[text()=' Login ']")
	       
	       WebElement login_btn;
	       
	       //action method
	       
	       public void setusername(String username) {
	    	   txt_username.sendKeys(username); 
	    	   
	       }
	       
	       public void setpassword(String pwd) {
	    	   txt_password.sendKeys(pwd);
	       }
	       
	       public void setloginbtn() {
	    	   login_btn.click();  
	       }
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	    		   
	       
          
}
