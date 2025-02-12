package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaContactusPage  extends BasePage1  {
	
	
	public QaContactusPage (WebDriver driver){
		super(driver);
		
	}
	
	//locator
	
	@FindBy(xpath = "//a[text()='Contact Us']")
	WebElement  contactusbreadcrump;
	
	
	
	// methods
	
	public boolean didwenavigatetocontactus() {
	 return	contactusbreadcrump.isDisplayed();
		 
	}
	
	 
}
