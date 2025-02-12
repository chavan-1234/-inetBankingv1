package com.inetbanking.testCases;

import static org.testng.Assert.fail;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Js1 { 
	WebDriver driver;
	
	@Test
	public void trip() {
		driver= new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		           JavascriptExecutor js = (JavascriptExecutor)driver;
		           js.executeScript("window.scrollBy(0,1000)");
//	try {    Assert.assertEquals(driver.getTitle(),"MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday1") ;}
//	catch (Exception e) 
//		
//	 {
//		System.out.println(e.getMessage()); 
//	}
		           
		             String actaultitle = driver.getTitle();
		             String expectedtitle="MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday1";
		             Assert.assertEquals(actaultitle,expectedtitle);
		             
		     
		           
		         // Assert.assertTrue(true);//it fail then it will stop execution further code
		          
//	WebElement roundtrip = driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::li[2]/span"));
//	roundtrip .click();
//	
//   WebElement from=  driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchCity inactiveWidget ']"));
//   from.click();
//  
////    WebElement hyd = driver.findElement(By.xpath("//li[@id='react-autowhatever-1-section-0-item-5']/descendant::div[2]"));
////   
////		hyd.click();
//WebElement dubai = driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::p[text()='Dubai, United Arab Emirates']"));
//dubai.click();
//		WebElement to = driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']"));
//	 to.click();
//	   WebElement mum = driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter']/descendant::div[@class='calc60'][1]"));
//	     
//	       mum.click();
//	         
//	         
//	         
//	     driver.findElement(By.xpath("//div[@class='DayPicker-Month']/descendant::div[@aria-label='Sun Mar 10 2024']")).click();
//	   //  driver.findElement(By.xpath("//div[@class='DayPicker-Month']/descendant::div[@aria-label='Sun Mar 10 2024']")).click();
//	     driver.findElement(By.xpath("//div[@class='DayPicker-Month']/descendant::div[@aria-label='Wed Mar 20 2024']")).click();
////	  WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
////	         
////	 search.click();
//	WebElement traveller = driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox flightTravllers inactiveWidget ']/descendant::label"));
//	traveller.click();
//	WebElement child = driver.findElement(By.xpath("//div[@class='appendBottom20']/descendant::li[@data-cy='adults-2']"));
//	child.click();
//	
//	WebElement apply= driver.findElement(By.xpath("//button[@class='primaryBtn btnApply pushRight']"));
//	apply.click();
//	
//	
//	WebElement search = driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
//    
//     search.click();
	}

}
