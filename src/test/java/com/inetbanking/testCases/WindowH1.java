package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

                    public class WindowH1 {
	                 public static void main(String[] args) throws IOException {
		
		             WebDriver driver=new ChromeDriver();
		             driver.get("https://omayo.blogspot.com/");
		             driver.manage().window().maximize();
		             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		             String parentwindow = driver.getWindowHandle();
//		               driver.findElement(By.xpath("//div[@id='HTML37']/descendant::a")).click();
//		               
//		                 Set<String> childwindow = driver.getWindowHandles();
//		                 for(String windows : childwindow ) {
//		                	 if(!windows.equals(parentwindow)) {
//		                		 driver.switchTo().window(windows);
//		                		     System.out.println(driver.getTitle()); 
//		                	 }
//		                 }
//		                 driver.switchTo().window(parentwindow);
//		            WebElement textbox = driver.findElement(By.xpath("//td[@class='gsc-input']/child::input"));
//	 
//		             textbox.sendKeys("ajay");
		             
		                 WebElement disabledbutton = driver.findElement(By.xpath("//input[@id='tb2']"));
		                      System.out.println(disabledbutton.isEnabled());  
		             WebElement but2 = driver.findElement(By.xpath("//button[@id='but2']"));
		            System.out.println(but2.isEnabled());
		            
		            WebElement disbut1 = driver.findElement(By.xpath("//button[@id='but1']"));
		                         System.out.println(disbut1.isEnabled()); 
		                         
		                         
//		            
//		    WebElement logo = driver.findElement(By.xpath("//div[@class='widget HTML']/preceding-sibling::div/child::div")) ;            
//		            File  src  =  logo.getScreenshotAs(OutputType.FILE);
//		            File trg= new File("\"C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\inetBankingv1\\\\Screenshots\\\\logo.png\"");
//		            
//		                 FileUtils.copyFile(src, trg);             
		                         
		                         
		                         
		                         
		                        
		                         
		                         
		            
		            
	}

}
