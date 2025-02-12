package com.inetbanking.testCases;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot2 {
          
        	 public static void main(String[] args) {
	  		 WebDriver driver= new ChromeDriver();
        		 driver.get("https://omayo.blogspot.com/");
        		 driver.manage().window().maximize();
     					
      	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     			
     			// all page 
     			
     			         TakesScreenshot ts = (TakesScreenshot)driver;
     			               File sourcefile = ts.getScreenshotAs(OutputType.FILE);
     			               
     			     File target=new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\Screenshots\\full.png");
     			     
     			     sourcefile.renameTo(target);      // copy source file to target file
     			     
     			// System.out.println(System.getProperty("user.dir"));    //System.getProperty("user.dir")
				//System.out.println("ajay");
     			     
     			     //ss of specific section 
     			     
     			     
//     			WebElement featureproduct = driver.findElement(By.xpath("//table[@id='table1']"))  ;  
//     			
//     			      File sourcefile = featureproduct.getScreenshotAs(OutputType.FILE);
//     	 File target=new File("C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\inetBankingv1\\\\Screenshots\\tablep.png");
//     	 
//     	         sourcefile.renameTo(target);    
     			     
     			     //   ss of webelement
     			//to take ss of specific element we can use same above code
     			     
     			     
     			     
     			     
     			     
     			     
     			     
     			     
			}
}
