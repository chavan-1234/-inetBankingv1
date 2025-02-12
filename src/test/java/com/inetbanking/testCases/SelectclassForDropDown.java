package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectclassForDropDown {
       public static void main(String[] args) {
		
    	   WebDriver driver=new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	   
    	//   autosuggetion dropdown
//    	   
//    	   driver.get("https://www.flipkart.com/");
//    	   
//    	     WebElement search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
//    	     search.sendKeys("bags");
//    	   
    	        driver.get("https://www.google.com/");
    	      
    	        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("java tutorial");
    	        
    	          List<WebElement> list = driver.findElements(By.xpath("//div[@id='Alh6id']/div/div/ul/li"));
    	                System.out.println( list.size());     
    	          
    	          for(  WebElement listitem :list) {
    	        	  
    	        	 if (listitem.getText().contains("java tutorialspoint")) {
    	        		 listitem.click();
    	        		 
						
					}
    	          }
    	   
    	   
    	   
	}
}
