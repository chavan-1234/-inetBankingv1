package com.inetbanking.testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Readdataproperties {
	public static void main(String[] args) throws IOException {
		 WebDriver driver= new ChromeDriver();
		 FileInputStream fis= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\MyData\\data.properties");
		 Properties pro= new Properties();
		 pro.load(fis);
		 driver.get(pro.getProperty("url"));
		 WebElement uname = driver.findElement(By.xpath("//input[@type='text']"));
		 uname.sendKeys(pro.getProperty("username"));
		 WebElement pass= driver.findElement(By.xpath("//input[@id='pass']"));
		 pass.sendKeys(pro.getProperty("password"));
		 
		 
		 driver.get("https://www.facebook.com/");
//		 
//		FileInputStream fis=new FileInputStream("path of the file");
//		Properties pro =new Properties();
//		pro.load(fis);//pro.getproperty
		 
		 
	}

}
