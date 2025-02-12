package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization1 {
       WebDriver driver;
	
	   @Test
	   @Parameters({"browser" , "url"})
	   public void sampletest(String browser, String url) {
		  
		   
		   
		   if(browser.equals("chrome")) {
			   WebDriver driver= new ChromeDriver(); 
			   driver.manage().window().maximize();
			   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   }
		   else if(browser.equals("firefox")) {
			   driver=new FirefoxDriver();
			    
		   }
		   driver.get(url);
		   
		   
		   
  }
}
