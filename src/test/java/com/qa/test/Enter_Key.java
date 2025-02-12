package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Key {
          public static void main(String[] args) {
       	   WebDriver driver= new ChromeDriver();
   	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	       driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
   	       driver.manage().window().maximize();
   	       
   	               WebElement searchbox = driver.findElement(By.xpath("//input[@value='Login']"));
   	               
   	            searchbox.sendKeys(Keys.ENTER);
   	            
   	            driver.navigate().back();
		}
}
