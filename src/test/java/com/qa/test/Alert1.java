package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
         public static void main(String[] args) {
        	 WebDriver driver= new ChromeDriver();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             driver.get("https://omayo.blogspot.com/");
             driver.manage().window().maximize();
             
             // alert four command    accept() , dismiss() , gettext
             
                WebElement alertbox = driver.findElement(By.xpath("//input[@id='alert1']"));
                alertbox.click();
                
                 Alert alert = driver.switchTo().alert() ;
               
                 String text_on_alert = alert.getText();
                 System.out.println(text_on_alert);
                 
                 alert.accept();
                 
               //  alert.dismiss();
		}
}
