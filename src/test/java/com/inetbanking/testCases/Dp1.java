package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dp1 {
	 WebDriver driver= new ChromeDriver();
	 
	      @Test(dataProvider="facebookdata")
	
	    
		
		public void login( ) {
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
		                 JavascriptExecutor jse = (JavascriptExecutor)driver;
		                 jse.executeScript("arguments[0].value='ajay'",username);
	//	username.sendKeys(user);
//		 WebElement password=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
//		 password.sendKeys(pass);
//		 
//		
//		 WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
//		login.click();
		
	      }
		
		
//		@DataProvider
//		public Object[][] facebookdata(){
//			Object[][] data= { { "ajay@gamil.com", "86985556" } , {"888867751" , "Ajaydada"}, 
//					{"chavan@gmail.com" ,"5698655"} };
//			  return data;
	     //  @DataProvider  
	           @DataProvider(name="data")
           public Object[] []    facebookdata() {
        	   Object [] []data= {{"ajay", "5894"},{"smdv", "5896"}, {"irgkldfsn", "5695"}};
        	   return data;
        	   
           }
	      
	      
	        @DataProvider
	        public Object[][] fdata(){
	        	Object [][] data2= {{"ajaay", " 256"}};
	        	return data2;
	        }
	         


			
			
		
}


