package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleOptionsCheck {

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		   
	 List<WebElement> mulcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		    
	     //  System.out.println( mulcheckbox.size());
	 
	     for(       WebElement checkbox   :mulcheckbox) {
	    	 if(!checkbox.isSelected()) {
	    		 checkbox.click();
	    	 }
	     }
	}
}
