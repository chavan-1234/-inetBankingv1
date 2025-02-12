package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OverrideIn_Selenium1 {
	
	WebDriver driver;
	public void launchchrome() {
		driver= new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	
	

}
