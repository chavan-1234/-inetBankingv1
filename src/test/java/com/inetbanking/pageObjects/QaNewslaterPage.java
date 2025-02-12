package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaNewslaterPage {
WebDriver driver;
	
	public QaNewslaterPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(xpath = "//label[@class='radio-inline']/child::input[@value='1']")
	WebElement yescheckbox;
	
	//method
	
	public boolean clickyesoptioncheckbox() {
		 return yescheckbox.isSelected();
	 
	
	}
	
}
