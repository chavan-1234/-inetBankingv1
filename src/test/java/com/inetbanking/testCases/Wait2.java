package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://omayo.blogspot.com/");
	//driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
             
	  WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(3 ));
      driver.findElement(By.xpath("//div[@class='dropdown']")).click();
	  WebElement fb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='dropdown']/child::div[@id='myDropdown']/a[2]")));
	  fb.click();
	

	  ///    Explicit Wait
//	      
//	 WebDriverWait  wait= new WebDriverWait(driver, 10);
//	      wait.until(ExpectedConditions.elementToBeClickable(null))
//	     
//	
//	            WebElement page = driver.findElement(By.xpath("//a[text()='Page One']"));
//	                       System.out.println(page.isDisplayed());
//	                     WebElement eb = driver.findElement(By.xpath("//button [@id='but2']"));
//	                     System.out.println(eb.isEnabled());
//	                     
	                     
//	         WebElement user = driver.findElement(By.xpath("//input[@id='email']")) ;             
//	         WebElement userl= driver.findElement  (By.xpath("//button[@id='loginbutton']")) ;             
	            //  JavascriptExecutor js = (JavascriptExecutor) driver;   
//	              js.executeScript("arguments[0].value='ajay'", user);
//	              js.executeScript("argumets[0].click()", userl) ;      
	              //    js.executeScript("window.scrollBy(0,800)") ;  
	                     
	                     
	             WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10))  ;
	           //  driver.findElement(By.xpath("//button[text()='Dropdown']"));
	           WebElement us = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
	              us.click();       
	                     
	                     
}
}
   