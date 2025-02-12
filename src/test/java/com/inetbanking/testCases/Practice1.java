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
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	public static void main(String[] args) throws IOException {
		
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//	File data= new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\MyData\\data.properties");
//	FileInputStream fis=new FileInputStream(data);
//     Properties pro=new Properties();
//     pro.load(fis);
//     driver.get(pro.getProperty("url"));
//     
//             WebElement username1 = driver.findElement(By.xpath("//input[@id='email']"));
//             username1.sendKeys(pro.getProperty("username"));
//             WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
//             pass.sendKeys(pro.getProperty("password"));
//             WebElement log = driver.findElement(By.xpath("//button[@name='login']"));
//             log.click();
//         
	  
	        driver.get("https://omayo.blogspot.com/");
	
	       // System.out.println( driver.getPageSource()); 
	      //for get the page source of the application
	   
	           WebElement dd = driver.findElement(By.xpath("//select[@id='drop1']"));
	           Select sel= new Select(dd);
	           sel.selectByVisibleText("doc 3");
	           
	             
	             
	
	

}
}