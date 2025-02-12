package com.inetbanking.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {             // constructor , locator , action methods
	
        	WebDriver driver; 
        	
        	
        	 
        	public LoginPage( WebDriver driver){
        		   this. driver =driver;
        	 }
        	 
        	 
        	 //locator
        	 
                 By  txt_username_loc  =  By.xpath ("//input[@placeholder='Username']");
                 
                  By txt_password_loc = By.xpath("//input[@placeholder='Password']");
                  
                  By loginbtn_loc  =  By.xpath("//button[@type='submit']");
                  
                  
                  //action methods
	
                     public void setusername( String username) {
                    	 
                    	 driver.findElement(txt_username_loc).sendKeys( username);
                     }
                     
                     public void setpassword( String pwd) {
                    	 driver.findElement(txt_password_loc).sendKeys(pwd);
                     }
                     public void loginbtn() {
                    	 driver.findElement(loginbtn_loc).click();
                     }
	
	
	
	
	
}
