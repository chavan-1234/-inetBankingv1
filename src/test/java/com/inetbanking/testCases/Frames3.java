package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames3 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/iframe");
		driver.get("http://omayo.blogspot.com/");
		
		// use explicit wait for specific element
		
		
		             WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(12));
		             
		             driver.findElement(By.xpath("//button[text()='Check this']")) .click();
		            // WebElement but1 = driver.findElement(By.xpath("//input[@id='dte']"));
		    WebElement but1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='dte']")));
		    but1.click();
		             boolean select= but1.isSelected();
		             System.out.println("button is select :" + select);
		             
		               
			         //  driver.findElement(By.xpath("//button[text()='Check this']")) .click();
			     
			     
			     
		
	}

}
