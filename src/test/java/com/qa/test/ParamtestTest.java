package com.qa.test;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamtestTest {
	
	
	 
	@Parameters ({"username" ,"password"})
  @Test
 
  public void f(String un , String pass ) {

      WebDriver driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  Assert.assertTrue(true);
  }
}
