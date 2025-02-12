package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practice2Test {
	WebDriver driver;
  @Test
  public void logintest() {
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.facebook.com/");
			
			//      //input[@id='email']
			//   //input[@id='pass']
			// //button[@name='login']
			   driver.findElement(By.xpath(""))
  }
}
