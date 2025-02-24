package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaRightsightOption extends  BasePage1{
	
	public QaRightsightOption(WebDriver driver) {
		super(driver);
		
	}

	
	@FindBy(xpath = "")
	WebElement rightsidemyacc;
	

	@FindBy(xpath = "")
	WebElement rightsideeidtacc;

	@FindBy(xpath = "")
	WebElement rightsidepassword;

	@FindBy(xpath = "")
	WebElement rightsideaddressbook;

	@FindBy(xpath = "")
	WebElement rightsidewishlist;

	@FindBy(xpath = "")
	WebElement rightsideorderhistory;
	

	@FindBy(xpath = "")
	WebElement rightsidedownload;

	@FindBy(xpath = "")
	WebElement recurringpayments;

	@FindBy(xpath = "")
	WebElement rightsiderewardpoints;

	@FindBy(xpath = "")
	WebElement rightsidelogout;
	
	public void clickrightlogout() {
		rightsidelogout.click();
	}
	
	
	
	
	
	
}

