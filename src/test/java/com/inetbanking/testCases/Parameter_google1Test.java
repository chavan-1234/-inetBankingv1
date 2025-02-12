package com.inetbanking.testCases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_google1Test {
	WebDriver driver;
	
	      @Parameters({"keyword"})
           @Test
          public void browser(String searchdata) {  
	     driver= new ChromeDriver();
	     driver.get("https://www.google.com/");
	     
	     WebElement search= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
	     search.sendKeys(searchdata);
	   
	     Assert.assertEquals(searchdata,search.getAttribute("value") );
	       //System.out.println(search.getAttribute("value")); 
	          
     }
}
