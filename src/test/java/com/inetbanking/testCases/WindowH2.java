package com.inetbanking.testCases;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowH2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
			driver.get("https://demo.automationtesting.in/Windows.html");
			driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		   
		 //for handling main window  use getwindowhandle method
		       
		                               String    mainwindow    = driver.getWindowHandle();
		    WebElement multiplewindowbutton = driver.findElement(By.xpath("//a [text()='Open Seperate Multiple Windows']"));
		    multiplewindowbutton.click();
		    
		                   driver.findElement(By.xpath("//button[text()='click ']")).click();
		                   
		                    
		                        Set<String> childwindows = driver.getWindowHandles();
		                        
		                        for( String singlewindow   :childwindows) {
		                        	
		                        	if(!singlewindow.equals(mainwindow)) {
		                        		
		                           driver.switchTo().window(singlewindow); // we have 2 windows
		                               String title  = driver.getTitle();
		                           
		                               //first window
		                           if(title.contains("Index")) {
		                        	   
		                           driver.findElement(By.xpath("//img[@id='enterimg']")).click();
		                           Thread.sleep(4000);
		                           
		                           driver.close();
		                           
		                            
		                           }
		                           //second window
		                           else if(title.contains("Selenium")) {
		                        	   
		                   driver.findElement(By.xpath("//a[@class='nav-link']/child::span[text()='Downloads']")).click();
		                   Thread.sleep(4000);
		                   driver.findElement(By.xpath("//a[text()='other languages exist']")).click();
		                   Thread.sleep(4000);
		                   driver.navigate().back();
		                   
		                   driver.close();
		                   
		                   
		                           }
                                  }
		                        	driver.switchTo().window(mainwindow);
		                    driver.findElement(By.xpath("// li[@class='active']/child::    a [@class='analystic']")).click();
		                        	
		                        }
		                        
		                        
		                        
		                        
		                    
		                      
		                    
		       
	}

}
