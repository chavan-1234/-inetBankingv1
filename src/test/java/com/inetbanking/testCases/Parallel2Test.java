package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Parallel2Test {
	 WebDriver driver= new ChromeDriver();
              @Test
       public void met1() {
         WebDriver driver= new ChromeDriver();
              driver.get("https://omayo.blogspot.com/");
              driver.manage().window().maximize();
          //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
              
            //  driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("text field");
              WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(3));
            WebElement dd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Dropdown']")));
//           WebElement dd = driver.findElement(By.xpath("//button[text()='Dropdown']")) ;       
//           dd.click();
            dd.click();
      }
              
}
