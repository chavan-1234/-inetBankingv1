package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcart {
      public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		   WebElement searchbutton = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		   searchbutton.sendKeys("mobiles");
		   searchbutton.sendKeys(Keys.ENTER);
		   
		  List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		  
		   System.out.println( mobiles.size());
		    		
		   for( WebElement mobile:mobiles) {
			       System.out.println( mobile.getText()); 
			       
			       if(mobile.getText().contains("SAMSUNG Galaxy F05 (Twilight Blue, 64 GB)")) {
			    	   mobile.click();
			    	   
			       }
			   
		   }
		 
		
		   
	}
}
