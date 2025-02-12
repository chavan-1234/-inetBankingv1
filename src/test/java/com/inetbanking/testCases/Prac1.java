package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Prac1 {
      public static void main(String[] args) {
		
    	  
    	  
  		WebDriver  driver=new ChromeDriver();
  			// driver.get("https://testautomationpractice.blogspot.com/");
  			 driver.get("http://omayo.blogspot.com/");
  			 driver.manage().window().maximize();
  			// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  			 
  			// Actions act= new Actions(driver);
  			  //scroll window using javascript executor
//			      JavascriptExecutor js= (JavascriptExecutor)driver;
//			      js.executeScript("window.scrollBy(0,500)");
			      
//  			      WebElement pointme = driver.findElement(By.xpath("//span[@id='blogsmenu']"));
//  			      
//  			      act.moveToElement(pointme).perform();
  			      
  			      //select class for dropdown
  			 
//  			  WebElement dd = driver.findElement(By.xpath("//select[@id='drop1']"));
//  			 Select sel=new Select(dd);
//  		  	 sel.selectByVisibleText("doc 2");
//  			 
  			
  			 //use wait
  			 
//  			      WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//  			 
//  			             WebElement dropbutton = driver.findElement(By.xpath("//button[text()='Dropdown']"));
//  			           dropbutton.click();
//  			           
//  			           
//  			          WebElement fb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
  			             
  			         //   fb.click();
  			            
//  			                    String orgurl = driver.getCurrentUrl();
//  			                    
//  			                          String expectedurl = "https://omayo.blogspot.cm/";
//  			                          
//  			                          Assert.assertEquals(orgurl, expectedurl);
//  			                          
  			                	  
  			           //window handle  
  			            WebElement cur_window = driver.findElement(By.xpath("//a[text()='SeleniumTutorial']"));
  			          cur_window.click();
  			          
  			            
  			            
  			 
  			 
  			 
  			 
  			      
  			      
  			      
  			    
  			      
  			 
	}
      
}
