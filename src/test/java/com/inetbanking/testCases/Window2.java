package com.inetbanking.testCases;

import java.time.Duration;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window2 {
 public static void main(String[] args) throws InterruptedException {
	 WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	                 String parentwindow1 = driver.getWindowHandle();
	                 
	          WebElement link1 = driver.findElement(By.xpath("//a[text()='SeleniumTutorial']")); 
	          link1.click();
	          Set<String> childwindows=driver.getWindowHandles();
	          
	                for(String allwindow :childwindows) {
	                	if(!allwindow .equals (parentwindow1)) {
	                		driver.switchTo().window(allwindow);
	                		WebElement sele = driver.findElement(By.xpath("//a[text()='What is Selenium?']"));
	                		sele.click();
	                	}
	                }
	                driver.switchTo().window(parentwindow1);
	              WebElement text = driver.findElement(By.xpath("//textarea[@id='ta1']"));
	              text.sendKeys("ajay");
	              Thread.sleep(3000);
	              text.clear();
	              
	               
	       
	          
	          
//	    //check button
//	       WebElement button= driver.findElement(By.xpath("//button[@id='but2']"));
//	         System.out.println(button.isDisplayed());
	    		Actions action=new Actions(driver);
	    	  WebElement but2 = driver.findElement(By.xpath("//li[@class='has-sub']"));
	            action.moveToElement(but2).perform();
}
 
}
