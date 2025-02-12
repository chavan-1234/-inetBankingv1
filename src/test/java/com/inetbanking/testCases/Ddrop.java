package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ddrop {
                 public static void main(String[] args) {
                	 WebDriver driver= new ChromeDriver();
             		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
             		driver.manage().window().maximize();
             	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
             	      
          WebElement dd = driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/child::select"));
             	      
             		Select sel=new Select(dd);
             		sel.selectByVisibleText("Angola");
             		
				}
}
