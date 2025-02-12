package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ama {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement se = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
//		se.sendKeys("apple");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		      List<WebElement> links = driver.findElements(By.tagName("a"));
//		     System.out.println(links.size());
		
		
//	WebElement checkbox = driver.findElement(By.xpath("//div[@id='deliveryRefinements']/descendant::span[text()='Get It Today']"));
//	checkbox.click();
	//driver.navigate().back();
	
	     //handle dropdown
	
	     
//	      WebElement dd  = driver.findElement(By.xpath("//div[@class='nav-search-facade']"));
////	      Select select= new Select(dd);
////	      select.selectByVisibleText("Baby");
//	      dd.click();
//	      
	      //windowhandle 
//		
//		   String parent = driver.getWindowHandle();
//	           WebElement shopfashion = driver.findElement(By.xpath("//a[text()='Shop fashion']"));
//	      
//	           shopfashion.click();
//	           
//	           
//	         WebElement mencloth = driver.findElement(By.xpath("//li[@id='sobe_d_b_1_1']"));
//	         mencloth.click();
//	        WebElement shirtsize = driver.findElement(By.xpath("//button[@aria-label='XS']"));
////	        shirtsize.click();
//		           WebElement sea = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		       JavascriptExecutor js = (JavascriptExecutor)driver;
//		      js.executeScript("arguments[0].value='ajay'", sea);
//		    WebElement se = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
//		       js.executeScript("arguments[0].click()", se);
//		       js.executeScript("window.scrollBy(0, 800)");
//		       driver.close();
//		       
		           
		                  List<WebElement> links = driver.findElements(By.xpath("//a"));
		                             int alllinks = links.size() ;
		                             System.out.println( alllinks);
		              )
	}

}
