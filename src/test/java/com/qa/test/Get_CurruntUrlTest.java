package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_CurruntUrlTest {
  @Test
  public void testUrl() {
	  WebDriver driver= new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://omayo.blogspot.com/");
      driver.manage().window().maximize();
      
              if(driver.getCurrentUrl().equals("https://omayo.blogspot.com/")) {
            	  System.out.println("test passed");
              }
              else {
            	  System.out.println("test failed");
              }
  }
}
