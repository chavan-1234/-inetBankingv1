package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot3 {
 public static void main(String[] args) throws IOException {
	
	 
	 WebDriver driver= new ChromeDriver();
	 driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	 
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 
	      WebElement logo = driver.findElement(By.xpath("//a/descendant::img"));
	        
	      
	        // specific element ss
	             File source  =logo.getScreenshotAs(OutputType.FILE);
	             File target= new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\Screenshots\\logo.png");
	           //  FileUtils.copyFile(source, target);
	            // source .renameTo(target)  ;
	           source.renameTo(target);
	 
}
	
	
}
