package com.inetbanking.testCases;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestdropDown {
	
	  public static void main(String[] args) {
		  
		WebDriver  driver=new ChromeDriver();
			 driver.get("https://www.google.com/");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.manage().deleteAllCookies();
//		    
//			 driver.findElement(By.xpath("//textarea[  contains(@id,'APjFqb')]")).sendKeys("testing");
//			 
//		  List<WebElement> allelement = driver.findElements(By.xpath("//ul[@role='listbox' ]/child::li[@class='sbct PZPZlf']")) ;
//			 
//			 for(  int i=0; i<allelement.size(); i++)   {
//				// System.out.println(allli.get(i).getText());
//				 
//				 if(allelement.get(i).getText().equals("testing types")) {
//					 allelement.get(i).click();
//				 }
//				 
//			 }
			  
//			 
//		     for(int i=0; i<allelement.size(); i++) {
//		    	 
//		    	if (allelement.get(i).getText().contains("testing types")){
//		    		allelement.get(i).click();
		    //	}
		    	  
		   //  }
	  
		  
		  driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("sports");
		  
		  //here we we use list to store values in form of object
		        List<WebElement> allele = driver.findElements(By.xpath("//div[@id='Alh6id']/child::div/child::div/child::ul/child::li"));
		        
		       for (int i=0; i<allele.size(); i++) {//list use size 
		    	   
		    	//  System.out.println( allele.get(i).getText());  
		    	  
		    	  if(allele.get(i).getText().equals("sports bike")) {
		    		  allele.get(i).click();
		    	  }
		       }
		  
		  
		  
		  
		  
			 
			 
	}

}
