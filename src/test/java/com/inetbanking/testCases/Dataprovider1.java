package com.inetbanking.testCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	 public static void main(String[] args) throws IOException {
		
			
	
	     
	      WebDriver driver= new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	     // driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	      File file= new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\inetBankingv1\\\\MyData\\\\data.properties");
	      FileInputStream fis =new FileInputStream(file);
	      Properties pro=new Properties();
	      pro.load(fis);
	      
	      
	      
	      
	      driver.get(pro.getProperty("url"));
	      WebElement username = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	           username.sendKeys(pro.getProperty("username"));
	           WebElement password=driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy _9npi']"));
	           password.sendKeys(pro.getProperty("password"));
	           WebElement login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	           login.click();
	            
         
		 //read data from properties file
		 
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  //driver.get("https//:www.facebook.com");
		  
		  File file=new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\MyData\\data.properties");
		  FileInputStream fis=new FileInputStream(file);
		  Properties pro=new Properties();
		  pro.load(fis);
		  
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	
//           @DataProvider(name="logindataprovider")
//          public Object[][] getdata() {
//            	  Object [][] data= {{"abc@gmail.com", "abc"}, {"xyz@gmail.com","xyz"}, {"mno@gmail.com","mno"}};
//				return data;
//	  
	  
  }
}
