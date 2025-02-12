package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method1 {
	
	public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
           WebElement link1 = driver.findElement(By.xpath("//a[text()='compendiumdev']"));
           link1.click();
           
           Thread.sleep(3000);
           //switch back to the original page
           driver.navigate().back();
           
           Thread.sleep(3000);
           
          driver.navigate().forward(); 
           
        
	}

}
