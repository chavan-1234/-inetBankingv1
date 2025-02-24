package com.inetbanking.testCases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
	       
	 /*  WebElement alertbox = driver.findElement(By.xpath("//input[@id='alert1']"));
	   alertbox.click();
	    Alert alert = driver.switchTo().alert();
	   System.out.println(alert.getText()); 
	   alert.accept();*/
	       
	       //checkbox
	  /*  WebElement checkbox = driver.findElement(By.xpath("//div[@id='HTML12']/descendant::div[1]/child::input[2]"));
	   checkbox.click();*/
	   
//	     WebElement button = driver.findElement(By.xpath("//button[@id='but1']"));
//	       System.out.println( button.isEnabled());
//		
	       
	       //js scroll down page
//	                   JavascriptExecutor js = (JavascriptExecutor)driver;
//	                   js.executeScript("window.scrollBy(0 , 400)");
//	       
	       
	       
	       //double click perform
	        WebElement dc= driver.findElement(By.xpath("//button[text()=' Double click Here   ']"));
	       
	      
	        Actions act= new Actions(driver);
	        
	        act.doubleClick(dc).perform();
	        
	        Thread.sleep(3000);     //it will wait foetr currunt thread
	        
	        Alert alt = driver.switchTo().alert();
	        alt.accept(); 
	               
	        
	        //button enabled or not
	        
	           WebElement buttoncheak = driver.findElement(By.xpath("//input[@id='tb2']"));
	                      boolean btncheck = buttoncheak .isEnabled();
	          
	                System.out.println(btncheck);
	        
	        
	}

}
