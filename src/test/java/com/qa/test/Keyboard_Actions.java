package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Actions {
     public static void main(String[] args) {
    	 WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://omayo.blogspot.com/");
         driver.manage().window().maximize();
         
         
	}
}
