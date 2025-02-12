package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	  public static void main(String[] args) {
		
			
			WebDriver  driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
			
			Actions act= new Actions(driver);
			
			  WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
			  driver.switchTo().frame(frame);
			  
			     WebElement first = driver.findElement(By.xpath("//h5[text()='High Tatras']/parent::li"));
			       
			        WebElement droparea = driver.findElement(By.xpath("//div[@id='trash']"));
			        
			        act.dragAndDrop(first, droparea).build().perform();
		  
	}
	
	
}
