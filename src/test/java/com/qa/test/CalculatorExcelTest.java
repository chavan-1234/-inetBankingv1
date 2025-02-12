package com.qa.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.inetbanking.utilities.Excelutility;

public class CalculatorExcelTest {
        public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    
		   
        
                 String filepath = "C:\\Users\\HP\\Desktop\\exceldata\\book2.xlsx";
                 
             int rows =  Utility .getrowcount(filepath, "calculatordata" );
             
             for (int i=1; i<=rows; i++) {
            	 
            	 //read data from excel
            	
            	String princ =  Utility .getcelldata(filepath, "calculatordata", i, 0);
       String rateofinterest =  Utility .getcelldata(filepath, "calculatordata", i, 1);
            	 String per1 = Utility  .getcelldata(filepath, "calculatordata", i, 2);
                 String per2 = Utility  .getcelldata(filepath, "calculatordata", i, 3);
               	String freq = Utility  .getcelldata(filepath, "calculatordata", i, 4);
          String exp_maturity = Utility .getcelldata(filepath, "calculatordata", i, 5);
          
               
          // pass retreive data into app
                      driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(princ);
                      driver.findElement(By.xpath("//input[@id='interest']")).sendKeys( rateofinterest);
                      driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(per1 );
                      
                    WebElement year = driver.findElement(By.xpath("//select[@id='tenurePeriod']"));
                    Select sel=new  Select(year);
                    sel.selectByVisibleText(per2);
                    
                     WebElement days = driver.findElement(By.xpath("//select[@id='frequency']"));
                     sel=new Select(days);
                     sel.deselectByVisibleText(freq);
                     
                     driver.findElement(By.xpath("//div[@class='cal_div']/descendant::img[1]")).click();
                     
                     //validation
                     
           String act_maturityval = driver.findElement(By.xpath("//span[@id='resp_matval']/child::strong")).getText();
                 
                     
                     if(   Double.parseDouble(exp_maturity)==Double.parseDouble( act_maturityval)   ) {
                    	 
                    	 System.out.println("test passed");
                     }
                     else {
                    	 System.out.println("test failed");
                     }
                      
             
                driver.findElement(By.xpath("//div[@class='cal_div']/descendant::img[2]")).click();
                
          
          
             } //for loop
                 
        }
}
