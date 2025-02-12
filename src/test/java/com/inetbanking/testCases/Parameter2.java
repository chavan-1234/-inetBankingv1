package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter2 {
	
	          WebDriver driver;
	  
	          @Parameters({"browser" , "url"})
	          @BeforeTest
	        public void login2(String brows , String ur ) {
	      	if(brows.equals("chrome")) {
	      		driver=new ChromeDriver();
	      	}
	      	else if(brows.equals("firefox")) {
	      		driver=new FirefoxDriver();
	      	}
	      	driver.get(ur);
	      	
	      }
	          
	          public void m2() {
	        	 String url1 = driver.getCurrentUrl();
	        	 Assert.assertEquals(url1, "https://omayo.blogspot.com/", "right");
	          }

}
