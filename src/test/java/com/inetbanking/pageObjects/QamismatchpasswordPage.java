package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QamismatchpasswordPage extends BasePage1{
	
	public  QamismatchpasswordPage(WebDriver driver) {
		super(driver);
		
	}

	  //loc 
	
	@FindBy(xpath = "//div[@class='col-sm-10']/descendant::div[text()='Password confirmation does not match password!']")
	WebElement pwderror;
	
	//method
	
	public String misspwdmsg() {
		
	 return	pwderror.getText();
	 
	}
	
}
