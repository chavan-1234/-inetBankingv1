package com.inetbanking.pageObjects;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetbanking.utilities.Elementutils;

public class BasePage1 {

	WebDriver driver;
	WebDriverWait wait;
	JavascriptExecutor js;
	Elementutils elementutils;
	
	
	 public BasePage1(WebDriver driver){
		
		this.driver=driver;
		this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	     this.js=(JavascriptExecutor)driver;
	     elementutils=new Elementutils(driver);
	     
		PageFactory.initElements(driver, this);
	}
	 
	 public WebDriver getdriver() {
		 return driver;
		 
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
