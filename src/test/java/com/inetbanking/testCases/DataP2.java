package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataP2 {
	       @Test(dataProvider = "logindata")
	       public void login(String uname, String pass) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	    WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	    username.sendKeys(uname);
	    WebElement password= driver.findElement(By.xpath("//input[@type='password']"));
	    password.sendKeys(pass);
		
	}
	     /*  @DataProvider(name="logindata")
	       public Object[][] getdata(){
	    	   Object[][] data= {{"ajay@gamil.com","123"},{"ram@gmail.com","2354"}};
	    	   return data;
	       }*/
	       
	       
	        @DataProvider(name ="logindata") 
	       public Object[][] getdata(){
	    	   Object[][] data= {{"ajay@gmail.com","123"}, {"xyz@gamil.com", "569"}};
	    	   		return data;
	       }
	       
	       
	       

}
