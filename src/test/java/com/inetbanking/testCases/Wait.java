package com.inetbanking.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.internal.invokers.ExpectedExceptionsHolder;

public class Wait {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		FileInputStream fi= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\MyData\\data.properties");
//		Properties pr= new Properties();
//		pr.load(fi);
//		System.out.println(pr.getProperty("username"));
//		
		
		   //div[@class='widget-content']/child::button[1]
		
//		     // #textbox1
//		WebDriverWait wait= new WebDriverWait(driver,5);
//	WebElement fb = wait.until(ExpectedCondition.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='gjdj']")));
		
		
		             String pwindow = driver.getWindowHandle();
       WebElement link = driver.findElement(By.xpath("//div[@id='HTML3']/descendant::a"));
            
          link.click();
          
                      Set<String> childwindow = driver.getWindowHandles();
                      for( String windows : childwindow ) {
                    	  if(!windows.equals(pwindow)) {
                    		  driver.switchTo().window(windows);
                    		 System.out.println( driver.getTitle()); 
                    		  
                    	  }
                      }
                    //  driver.switchTo().window(pwindow);
          
		 
		
		
		
		
	
	}

}
