package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findalllink1 {
	public static void main(String[] args) {
		
	
	        WebDriver driver= new ChromeDriver();
    
            driver.get("https://omayo.blogspot.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            
          //find all links on page
            
            List<WebElement> links = driver.findElements(By.xpath("//a"));
              for(int i=0; i<=links.size(); i++) {
            	  System.out.println(links.get(i));
              }
             
      /*  for (WebElement link: links) {
        	System.out.println(link.getText());
        	
        }*/
    
    
	}
}
