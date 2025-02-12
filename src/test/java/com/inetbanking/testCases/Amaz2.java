package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amaz2 {
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.amazon.in/");
		  
		  //  WebElement alldrop = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		     //scroll up 
		            JavascriptExecutor js = (JavascriptExecutor)driver;
		           // js.executeScript("window.scrollBy(0,500)");
		          WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		        //  js.executeScript("arguments[0].value='headphone'", searchbox);
		     searchbox.sendKeys("headphone");
		     
	        WebElement hw_mic = driver.findElement(By.xpath("//div[@class='s-suggestion-container']/descendant::div[@aria-label='headphones with mic']"));
	       js.executeScript("arguments[0].click()",hw_mic );
	       
	
	}

}
 