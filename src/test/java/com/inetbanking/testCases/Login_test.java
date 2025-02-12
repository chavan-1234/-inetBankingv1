package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class Login_test {
	
	WebDriver driver;
	
	
	 @BeforeMethod
	 
	 public void setup() {
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
	 }
	 
	   @ Test(priority = 1,dataProvider ="sjsj" )
	  
	   public void logintest() {
		   LoginPage lp=new LoginPage(driver);
		   lp.setusername("8888677516");
		   lp.setpassword("Ajaydada");
		   lp.loginbtn();
		   Assert.assertEquals(driver.getTitle(), "ajay");
	   }
	 

}
