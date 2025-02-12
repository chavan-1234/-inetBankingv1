package com.qa.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectDemo1  {
	WebDriver driver;
	 @Test
	 public void login_1() {
		 driver=new ChromeDriver();
         driver.get("https://www.amazon.in/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
         
         //handle dropdown
                WebElement all_search_dropdownfield = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
                    Select sel=new Select(all_search_dropdownfield);
                    
                    //to handle dropdown we use = selectbyvalue, selectbyindex, selectByvisibleText,getoption,deselectall
                      sel.selectByVisibleText("Baby");
//                    sel.selectByValue("search-alias=mobile-apps");
//                    sel.selectByIndex(3);
                   // sel.deselectAll();
                // System.out.println(sel.getOptions());     
                    //select[@id='searchDropdownBox']
                      WebElement seachbox= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
                      seachbox.click();
	 }
	
	
}
