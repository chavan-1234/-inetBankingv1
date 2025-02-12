package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Without_Sendkeys1Test {
	
	WebDriver driver;
	
          @Test
               public void test() {
        	  driver=new ChromeDriver();
        	  driver.get("https://www.facebook.com/");
        	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	            WebElement emailfield = driver.findElement(By.xpath("//input[@id='email']"));
        	                JavascriptExecutor jse = (JavascriptExecutor) driver;
        	                jse.executeScript("arguments[0].value='ajay'",emailfield );
	  
  }
}
