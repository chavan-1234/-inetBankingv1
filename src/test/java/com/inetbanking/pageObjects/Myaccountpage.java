package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends BasePage1 {
	
	
    public	Myaccountpage(WebDriver driver) {
    	super(driver);
    	
    }
    
    @FindBy(xpath = "//h2[text()='My Account']")
    WebElement msgheading;
    
    @FindBy (xpath = "//div[@class='list-group']/child::a[text()='Logout']")
    WebElement linklogout;
    
    
    public boolean isMyAccpageexist() {
    	
    	try {
    	return( msgheading.isDisplayed());
    	}
    	catch (Exception e) {
		return false;
		
		}
    	
    }
    
    public void clicklogout() {
    	linklogout.click();
    }
}
