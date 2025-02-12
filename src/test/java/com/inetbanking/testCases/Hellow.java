package com.inetbanking.testCases;

import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.ClientAnchor;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hellow {
	 public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize()	;	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		//test title
//		           String original = driver.getTitle  ();
//		String expected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
//		      if(original.equals(expected)) {
//		    	  System.out.println("succesfully login");
//		    	  
//		      }
//		      else {
//				System.out.println("login faild");
//			}
		                
//		
//		              String parent = driver.getWindowHandle();
//		             WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		             mobile.click();
//		             
//		               

//           			WebElement oneplus_checkbox = driver.findElement(By.xpath("//li[@class='a-spacing-micro']/descendant::label/child::input[@id='apb-browse-refinements-checkbox_6']"));
//           			oneplus_checkbox.click();      
		             
		               WebElement apple_checkbox = driver.findElement(By.xpath("//input[@id='apb-browse-refinements-checkbox_6']/following-sibling::i"));
           			   apple_checkbox.click();  
		               WebElement box=driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - Pink']"));
		               box.click();
		               
		               Set<String> child_windows = driver.getWindowHandles() ;
		               
		               for(     String allwindow  :child_windows ) {
		            	   if(!allwindow.equals(parent)) {
		            		   driver.switchTo().window(allwindow);
		            		   driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		    	               
		            		   
		            	   }
		               }
		               
		                 WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
	                       email.sendKeys("8999269673");
	                       
	                       //switch back
	                       driver.switchTo().window(parent);
	}
	 
	 
	 
	 
	

}
