package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
  public static void main(String[] args) {
	  WebDriver driver= new ChromeDriver();
		// driver.get("https://the-internet.herokuapp.com/iframe");
	  // driver.get("https://omayo.blogspot.com/");
	  driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	      // first we switch to frame
	       driver.switchTo().frame("mce_0_ifr");  
	       driver.findElement(By.xpath("//body[@id='tinymce']/child::p")).clear();
	       driver.findElement(By.xpath("//body[@id='tinymce']/child::p")).sendKeys("ajay");
	       
	       //defaultcontent method used to switch back from frame
	       
	         // use name locator for switch frame
	     driver.get("https://docs.oracle.com/javase/8/docs/api/");  
	     driver.switchTo().frame("classFrame");  //use name   locator
	       driver.findElement(By.linkText("Description")).click();
	     
	       //create a webelement for switch to frame
	     //  driver.findElement(By.xpath(""))
	       
	       //using index we can swith to frame
	       
	       driver.switchTo().frame(0);
	       driver.findElement(By.xpath("//body[@id='tinymce']/child::p")).clear();
	       
//	       
//	       driver.switchTo().frame("iframe1");
//	       driver.findElement(By.xpath("//iframe[@id='iframe1']")).sendKeys("frames");
//	       
//	       
//	             driver.switchTo().frame("mce_0_ifr");
//	             WebElement enteriframe = driver.findElement(By.xpath("//body[@id='tinymce']/child::p"));
//	             enteriframe.clear();
//	       
//	       
//	       
//	       
	       
	       
	       
	       
	       
	       
	       
}
}
