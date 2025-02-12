package com.inetbanking.testCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js12 {
      public static void main(String[] args) throws InterruptedException {
		
    	       WebDriver driver= new ChromeDriver();
    	       driver.get("https://mytestingthoughts.com/Sample/home.html");
    	       
    	       JavascriptExecutor jse=(JavascriptExecutor)driver;
    	       Thread.sleep(3000);
    	       
    	       // generate alert popup
    	       jse.executeScript("alert('arun')");
    	     
    	       
    	       //click()
    	   WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
    	   jse.executeScript("arguments[0].value='ajay'", firstname);
    	   //for click
    	   jse.executeScript("arguments[0].click()", firstname );
    	   
    	   
    	   
    	   //rfresh browser
    	   
    	   jse.executeScript("history.go(0)");
    	   
    	   //retrun tilte and url using js
    	   jse.executeScript("return document.title;").toString();
    	   
    	   jse.executeScript("return document.URL;").toString();
    	   
    	   
    	       
    	  
	} 
}
