package com.inetbanking.testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowH3 {
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		       String parentWindow = driver.getWindowHandle();
		       
		       WebElement n = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		       js.executeScript("arguments[0].click();", n);
		       
		      
		      
		       
		    
		           Set<String> handles = driver.getWindowHandles();
		           
		          for(String handle:handles) {
		        	  
		        	String title = driver.switchTo().window(handle).getTitle();
		        	 
		        	 if(title.equals("XPath Practice - H Y R Tutorials")) {
		        		 driver.switchTo().window(handle);
		        		 
		       driver.findElement(By.xpath("//label[text()='First Name ']/following-sibling::input[1]")).sendKeys("ajay");
		        	  
		         Thread.sleep(5000);
		         driver.close();
		         
		        		  
		        		  
		        	  }
		        	 else if(title.equals("Basic Controls - H Y R Tutorials")) {
		        		 driver.switchTo().window(handle);
		        		 
		        		 driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("hyr");
		        		 
		        	 }
		        	  
		        	  
		          }



		           
		       
	}
}
