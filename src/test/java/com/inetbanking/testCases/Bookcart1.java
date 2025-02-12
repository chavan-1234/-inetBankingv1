package com.inetbanking.testCases;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class Bookcart1 {
       
	  public static void main(String[] args) throws InterruptedException {
		
	
	   
	     WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://bookcart.azurewebsites.net/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	      
	   
	      WebElement loginbutton = driver.findElement(By.xpath("//span[text()=' Login ']"));
	      loginbutton.click();
//	      WebElement reg= driver.findElement(By.xpath("//span[text()='Register']"));
//	      reg.click();
//	      WebElement fname = driver.findElement(By.xpath("//input[@placeholder='First name']"));
//	      fname.sendKeys("Ajay");
//	    WebElement lname = driver.findElement(By.xpath(" //input[@placeholder='Last Name']"));
//	    lname.sendKeys("Chavan");
//	            WebElement username = driver.findElement(By.xpath(" //input[@placeholder='User name']"));
//	            username.sendKeys("Ajay Vilas Chavann");
//	            WebElement password = driver.findElement(By.xpath(" //input[@placeholder='Password']"));
//	            password.sendKeys("428262Cl");
//	            WebElement cpass = driver.findElement(By.xpath(" //input[@placeholder='Confirm Password']"));
//	            cpass.sendKeys("428262Cl");
//	            WebElement gendermale = driver.findElement(By.xpath("//input[@value='Male']"));
//	            gendermale.click();
//	            WebElement register = driver.findElement(By.xpath("//span[@class='mat-mdc-button-touch-target']/preceding-sibling::span[text()='Register']"));
//	            register.click();
	      
	      
	      
	   WebElement  username= driver.findElement(By.xpath("//input[@placeholder='Username']"));
	   username.sendKeys("Ajay Vilas Chavann");
	   WebElement  pass= driver.findElement(By.xpath("//input[@placeholder='Password']"));
	   pass.sendKeys("428262Cl");
	  WebElement login = driver.findElement(By.xpath("//span[text()='Login']"));
	  login.click();
	  
	     WebElement harry1 = driver.findElement(By.xpath("//div[@class='p-1 ng-star-inserted']/descendant::a[@ng-reflect-message='Harry Potter and the Chamber o']"));
	         harry1.click();
	         Thread.sleep(2000);
	         
	       //  driver.navigate().back();
	        
	     WebElement search=driver.findElement(By.xpath("//input[@type='search']"));
        search.sendKeys("Rot & Ruin");
	     WebElement s1= driver.findElement(By.xpath("//span[text()=' Rot & Ruin ']"));
	     s1.click();
	   driver.findElement(By.xpath("//input[@aria-label='search']")).clear();
	     
	    // WebElement rr= driver.findElement(//strong[text()='Rot & Ruin'])
	     Thread.sleep(3000);
	     
	     WebElement search1=driver.findElement(By.xpath("//input[@type='search']"));
	     search1.sendKeys("the help");
	     WebElement thehelp = driver.findElement(By.xpath("//span[text()=' The Help ']"));
	     thehelp.click();
	     driver.findElement(By.xpath("//input[@aria-label='search']")).clear();
	  
	        WebElement search2=driver.findElement(By.xpath("//input[@type='search']"));
	        search2.sendKeys("The hookup");
	        WebElement thehookup = driver.findElement(By.xpath("//span[text()=' The Hookup ']"));
	        thehookup.click();
	        
//	      WebElement rot2 = driver.findElement(By.xpath("//strong[text()='Rot & Ruin']"));
//	      rot2 .click();
//	      
//	      WebElement roomies = driver.findElement(By.xpath("//strong[text()='Roomies']"));
//	      roomies.click();
	      
//	      JavascriptExecutor js= (JavascriptExecutor)driver;
//	       js.executeScript("arguments[0].value='ajay'",search2);
	        
	        JavascriptExecutor js= (JavascriptExecutor)driver;
	        js.executeScript("arguments[0].value='ajay", search);//use sendkeys
	        js.executeScript("arguments[0].click", args);
	        
	        
	        
	        
	        
	        
	        
	        
	  }    
	 
}
