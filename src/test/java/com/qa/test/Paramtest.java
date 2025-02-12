package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paramtest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		  
		  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		  
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
