package com.qa.test;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionsrelate {
	
	WebDriver driver;
	@Test
	public void actiton_demo() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//we use actions class sendkeys ()  without use click()
		
        driver.get("https://www.facebook.com/");
		   WebElement emailtext = driver.findElement(By.xpath("//input[@id='email']"));
		   emailtext.sendKeys("8888677516");
		   WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	    	pass.sendKeys("ajaydada");
	    	
	    	Actions action=new Actions(driver);
	    	//WebElement login = driver.findElement(By.xpath("//button[@id='u_0_5_E2']"));
		    action.sendKeys(Keys.ENTER);
		    
		    //methods = movetoelement, rightclick(), doubleclick(), drag and drop;
		
	}

}
