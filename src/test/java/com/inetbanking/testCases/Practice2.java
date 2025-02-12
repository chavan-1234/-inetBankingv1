package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
      public static void main(String[] args) {

  		WebDriver driver= new ChromeDriver();
  		driver.get("https://www.selenium-tutorial.com/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  		
  		  WebElement signbtn = driver.findElement(By.xpath("//a[@id='header-sign-up-btn']"));
  		signbtn.click();
	}
}
