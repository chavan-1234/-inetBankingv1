package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Without_Sendkeys1 {
	 WebDriver driver;
	//use js
	 @Test
         public void test1() {
		  driver= new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		    WebElement mobile_speaker = driver.findElement(By.xpath("//div[text()='Best Selling Mobile Speakers']"));
		    
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 
	 
	 
	 
	 
	   //ll)
		  
        js.executeScript("arguments[0].click()", mobile_speaker); 
		
	}
}
