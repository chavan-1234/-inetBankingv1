package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramePage {
  
	
	    WebDriver driver;
	      //constructor
	    public  FramePage(WebDriver driver) {
	            this.driver  =	driver; 
	            
	            PageFactory.initElements( driver , driver);
	            
	            
	        }
	    
	    //locator
	    
	     @FindBy
	     
	
	
	
	 
}
