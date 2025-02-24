 package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaAccountLogoutpage  extends BasePage1{
	 public  QaAccountLogoutpage(WebDriver driver) {
	    	super(driver);
	    	
	    }
	 
	 @FindBy(xpath = "//h1[text()='Account Logout']")
	 WebElement acclogoutheading;
	 
	 @FindBy(xpath = "//a[text()='Continue']")
	 WebElement continuebutton;
	 
	 
	 
	 public boolean isaccheadingdisplay() {
		 return  elementutils.iselementdisplayed(acclogoutheading) ;                 
		 
	 }
	 public void clickcontinuebutton() {
		 continuebutton.click();
		 
	 }
	 
}
