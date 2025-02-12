package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Dp5 {
    
	WebDriver driver;
	@BeforeTest
	
	public void setup() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	
	
//	@Test
//	public void logintest() {
//		
//	    WebElement username= driver.findElement(By.xpath("https://www.facebook.com/"));
//		
//	}
//	
}
