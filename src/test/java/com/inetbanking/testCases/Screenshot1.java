package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
	 public static void main(String[] args) throws IOException {
		
		/* WebDriver driver= new ChromeDriver();
		 driver.get("https://omayo.blogspot.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	  WebElement logo = driver.findElement(By.xpath("//div[@class='post-outer']/descendant::a[2]"));
	  
//	        File src = logo.getScreenshotAs(OutputType.FILE);
//	        File trg= new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\Screenshots\\logo.png");
//	        FileUtils.copyFile(src, trg);
	  
	          //TakesScreenshot ts= (TakesScreenshot)driver ;
	          File   src     =logo.getScreenshotAs(OutputType.FILE);
	          File trg= new File("location");
	          FileUtils.copyFile(src, trg);
	          
	          
	          */
		  WebDriver driver= new ChromeDriver();
		  //driver.get("https://www.facebook.com/");
			driver.get("https://omayo.blogspot.com/");	
				
		 
	}

}
