package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

         public class select1 {
        	 public static void main(String[] args) {
				
			
	       WebDriver driver= new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	      driver.get("https://omayo.blogspot.com/");
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       WebElement dropdown = driver.findElement(By.xpath("//div[@class='sidebar section']/descendant::select[2]"));
	       Select select= new Select(dropdown);
	         select.selectByVisibleText("doc 3");
	      // select.selectByIndex(3);
	      // select.selectByValue("mno");
	          driver.get("https://www.facebook.com/");
	       WebElement un = driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']"));
	       un.sendKeys("8888677516");
	       
	        WebElement passs = driver.findElement(By.xpath("//input[@id='pass']"));
	        passs.sendKeys("Ajaydada");
	           
	           
	              Actions act = new Actions(driver);
	       // WebElement log = driver.findElement(By.xpath("//button[@id='u_0_5_X4']"));
	        WebElement log= driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
	        
	        log.click();
	               
	                
	           Alert alt = driver.switchTo().alert();
	       
	           alt.accept();
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
	       
         }
}
