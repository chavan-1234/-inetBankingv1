package com.qa.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogle {
       
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        driver.findElement(By.xpath("//textarea[contains(@id,'AP')]")).sendKeys("sport");
        
      List<WebElement> sportdata = driver.findElements(By.xpath("//div[@jsname='erkvQe']/child::div/child::ul/child::li"));
      
     
       for(      WebElement data :sportdata) {
    	   
    	           System.out.println(data.getText());
    	           
    	         if(data.getText().contains("sports shoes")){
    	        	 data.click();
    	         }
    	         else {
					System.out.println("not found");
				}
    	        	 
    	         }
}
}