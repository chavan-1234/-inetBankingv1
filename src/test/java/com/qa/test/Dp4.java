package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Dp4 {
	
         
	WebDriver driver;
	@Test(dataProvider ="testdata")
	
	public void setup(String email, String pas) {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.facebook.com/");
		         WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
		         emailid.sendKeys(email);
		         WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		         pass.sendKeys(pas);
	}
		
	
	
	   @DataProvider(name="testdata")
	   public Object [][] facebookdata(){
		   
		   Object[][] data = {{"ajay@gmail.com", "8578"},{"nangre@gmsil.com","6985"},{"chavan@gmail.com","8754"}};
		   return data;
	   }
	
	
	}
	

