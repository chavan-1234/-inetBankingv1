package com.inetbanking.testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks_practice1 {
	
	  public static  WebDriver  driver;
	
         public static void main(String[] args) {
        	 
			 driver=new ChromeDriver();
			 driver.get("https://utkarshaaacademy.com/");
			 
			        List<WebElement> links = driver.findElements(By.tagName("a"));
			           System.out.println(links.size());    
			           
			           for(    WebElement link  :links) {
			        	            String url = link.getAttribute("href");
			        	            if(url==null || url.isEmpty()) {
			        	            	System.out.println("url is null");
			        	            	continue;
			        	            }
			        	           
			        	      try {
								HttpURLConnection huc = (HttpURLConnection) ( new URL(url).openConnection());
								
								if(huc.getResponseCode()>400) {
									System.out.println("url is broken ");
								}
								
								
								
								
								
								
								
								
								
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
			           }
		}
}
