package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultiBrowsert1 {
	    public static void main(String[] args) {
			
	    	   String browser= "chrome";
	    	   WebDriver driver=null;
	    	 
	    	   
	    	 if(browser.equalsIgnoreCase("chrOme")) {
	    		 driver= new ChromeDriver();
	    		 driver.manage().window().maximize();
	    		 driver.get("https://omayo.blogspot.com/");
	    	 }
	    	 else if(browser.equals("firefox")) {
	    		 driver=new FirefoxDriver();
	    	 }
	    	 else if(browser.equals("ie")) {
	    		 driver= new InternetExplorerDriver();
	    	 }
	    	 else {
	    		 System.out.println("never found any browser");
	    	 }
				
			
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	
		}

}
