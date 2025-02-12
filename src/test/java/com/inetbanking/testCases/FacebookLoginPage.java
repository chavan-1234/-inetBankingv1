package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginPage {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("8888677516");
	 WebElement pwd = driver.findElement(By.xpath("//input[@id='pass']"));
	 pwd.sendKeys("Ajaydada");
	 WebElement  lgnbtn  =  driver.findElement(By.xpath("//button[contains(@id,'u_')]"));
	// lgnbtn.click();
	// lgnbtn .submit();
	 //js. and action class
	 
	 
	
		
		
	}
	
}
