package com.inetbanking.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithJs extends BasePage1{
	
	    // WebDriver driver;        //instance variable
	    // JavascriptExecutor js;
	      public LoginPageWithJs (WebDriver driver) {
	    	  
	    	  super(driver);
//	    	   this.driver  = driver;    //local driver 
//	    	                
//	    	       this. js=(JavascriptExecutor) driver;
//	    	            
//	    	        PageFactory.initElements(driver, this);
	    	        
	      }
	      
	      //locator
	      
	         @FindBy(xpath = "//input[@placeholder='Username']")
	         WebElement usernamefield;
	         
	         @FindBy(xpath = "//input[@placeholder='Password']")
	         WebElement passwordfield;
	         
	    	 @FindBy(xpath = "//div[contains(@class,'oxd' )]/descendant::button")
	    	 WebElement loginbutton;
	    	 
	    	                
	    	  
	    	// action methods 
	    	 
	    	 public void setusername(String un) {
	    		 js.executeScript("arguments[0].value= '"+ un +"' ;" , usernamefield);
	    	 }
	    	 
	    	 public void setpassword(String pwd) {
	    		 
	    	  js.executeScript("arguments[0].value=' "+ pwd + "'; " ,passwordfield );
	    	  
	      }
	    	 
	    	 public void clickloginbtn() {
	    		 js.executeScript("arguments[0].click();",loginbutton );
	    	 }
	     
	

}
