package com.qa.test;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tscrenshot {
   public static void main(String[] args) {
	
	   
	   WebDriver driver= new ChromeDriver();
	   driver.get(null);
	   
	         TakesScreenshot ts = (TakesScreenshot)driver;
	               File source = ts.getScreenshotAs(OutputType.FILE);
	               
	               File target=new File("path");
	               
	               source.renameTo(target);
	               
	                     
	    
}
}
