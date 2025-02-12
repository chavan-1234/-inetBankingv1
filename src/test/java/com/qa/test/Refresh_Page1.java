package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Refresh_Page1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		//driver.navigate().refresh();
		
		
		
//		Actions act=new Actions(driver);
//		act.sendKeys(Keys.F5).build().perform();
		
		
		
		                  JavascriptExecutor jse = (JavascriptExecutor)driver;
		                  jse.executeScript("window.location.reload();");
		                  
		
		
		
		// driver.get(driver.getCurrentUrl());
		
		
		//driver.navigate().to(driver.getCurrentUrl()) ;
		
		
		
		
	}

}
