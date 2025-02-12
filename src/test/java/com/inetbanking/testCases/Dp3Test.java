 package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp3Test {
	
	 WebDriver driver;
	
        @Test(dataProvider = "facebookdata")
  
        public void login_Test_01(String name , String password ) {
	    driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	              WebElement   username  = driver.findElement(By.xpath("//input[@id='email']"));
	              username.sendKeys(name);
	              WebElement pass1 = driver.findElement(By.xpath("//input[@id='pass']"));
	                JavascriptExecutor js = (JavascriptExecutor)driver;
	             js.executeAsyncScript("arguments[0].value='name'", pass1);
	    
        }   
	           
	  
	     @DataProvider
	    public Object [][] facebookdata(){
	    	  Object [][] data = { {"ajay" ,"5855"}, {"ram", "563"} , {"shyam","635"} };
	    	  return data;
	     }
        
}
