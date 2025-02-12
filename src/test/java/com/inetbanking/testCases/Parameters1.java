package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	 @Parameters({"Browser"})
	       @Test
	       public void login(String Browser) {
	    	   if(Browser.equals("Chrome")) {
	    		   WebDriver driver= new ChromeDriver();
	    	   }
	    	   else if(Browser.equals("Firefox")) {
	    		   
	    		   WebDriver driver= new FirefoxDriver();
	    	   }
	    	   else if( Browser.equals("IE")) {
	    		   WebDriver driver= new InternetExplorerDriver();
	    	   }
	    	   else {
	    		   System.out.println("browser  not found");
	    	   }
	       }

}
