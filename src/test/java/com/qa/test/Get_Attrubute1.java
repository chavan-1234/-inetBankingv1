package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Get_Attrubute1 {
     
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		
 String searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getAttribute("class");
 System.out.println(searchbox );
             
            if(searchbox.equals("nav-input nav-progressivattribute")) {
            	System.out.println("right");
            }
            else {
            	System.out.println("no");
            }
		 
		 
	}	
	
}
