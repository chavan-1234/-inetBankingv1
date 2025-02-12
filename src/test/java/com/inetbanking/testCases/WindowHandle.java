package com.inetbanking.testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
    
public class WindowHandle {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	                 String parentwindow = driver.getWindowHandle();
//	       
//	   WebElement link = driver.findElement(By.xpath("//div[@class='sidebar section'][1]/descendant::a[4]"));
//	   link.click();
//	   
//	   Set<String> handles=driver.getWindowHandles();
//	   for(String handle:handles) {
//		   if(!handle.equals(parentwindow )) {
//			WebDriver childwindow = driver.switchTo().window(handle);
//			System.out.println(childwindow.getTitle());
//		   }
//	   }
//	   driver.switchTo().window(parentwindow);
//	      WebElement textField = driver.findElement(By.xpath("//textarea[@id='ta1']"));
//	       textField.sendKeys("ajay");
	       
	                    String pw = driver.getWindowHandle();
	                   WebElement link = driver.findElement(By.xpath("//div[@class='sidebar section'][1]/descendant::a[4]"));
	             	   link.click();  
	             	              Set<String> cw = driver.getWindowHandles();
	             	              for(   String windows   : cw) {
	             	            	  if(!windows.equals(pw)) {
	             	            		  driver.switchTo().window(windows);
	             	            	//	  driver.findElement(By.xpath("mm));
	             	            	  }
	             	              }
	     
	      
	}

}
     