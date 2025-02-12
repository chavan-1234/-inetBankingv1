package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {
//iframe is the one of the tags available in html
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		
		driver.switchTo().frame("singleframe");
		
	}
}
