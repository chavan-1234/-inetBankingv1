package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication_popup1 {
  // pass user+pass+url
	        public static void main(String[] args) {
				
			WebDriver  driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
					
			
	        // how do you work with page onload authentication popup
	        
	        
	        }
	        
	
}
