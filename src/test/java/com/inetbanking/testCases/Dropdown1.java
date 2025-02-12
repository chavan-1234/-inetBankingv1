package com.inetbanking.testCases;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdown1 {
         public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://omayo.blogspot.com/");
			// driver.get("https://bookcart.azurewebsites.net/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		  WebElement dd = driver.findElement(By.xpath("//select[@id='drop1']"));
		  Select select = new Select(dd);
		  select.selectByVisibleText("doc 3");
			
			
			//window handle
		     String parent = driver.getWindowHandle();
		     
		    WebElement firstwindow = driver.findElement(By.xpath("//div[@class='sidebar section']/descendant::a[text()='SeleniumTutorial']"));
		    firstwindow.click();
			  
		                Set<String> childwindow = driver.getWindowHandles();
		               		                
		                   //Set<String> cw = driver.getWindowHandles();
		                for( String windows:childwindow) {
		                	if(!windows.equals(parent)) {
		                		driver.switchTo().window(windows);
		             		WebElement sele = driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
		             		sele.click();
		                		
		                	}
		                }
		                driver.switchTo().window(parent);
		            WebElement textfield = driver.findElement(By.xpath("//textarea[@id='ta1']"));
		            textfield.sendKeys("return in first window");
		    
		    
		    // check currunt url using assert class
//			
//			String actualurl = driver.getCurrentUrl();
//			Object currunturl = "https://omayo.blogspot.com/";
//			Assert.assertEquals(actualurl, currunturl);		    
			     Thread.sleep(3000);
		                  JavascriptExecutor js = (JavascriptExecutor) driver;
		                  js.executeScript("window.scrollBy(0 , 800)");
		                  
		                  
//		                   Assert.assertEquals(driver.getTitle()," omayo (QAFox.com)" );
//		 
		              System.out.println( driver.getTitle());
		             
		            
		            
		   
		   
		   
		}
	
}

