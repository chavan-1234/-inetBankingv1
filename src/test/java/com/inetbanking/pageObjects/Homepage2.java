package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage2 extends  BasePage1{

	//contructor for initialize
	public Homepage2(WebDriver driver) {
		super(driver);
	}
	
	//locator
	
	
	@FindBy(xpath = "//span[text()='My Account']")
	WebElement myacc;
	
	@FindBy(xpath =  " //ul[@class='dropdown-menu dropdown-menu-right']/child::li/child::a[text()='Register']")
	WebElement regbtn;
	
	@FindBy(xpath = "//ul [@class='dropdown-menu dropdown-menu-right']/child::li/following-sibling::li/child::a")
	WebElement linklogin;
	
	
	public void clickmyacc() {
		 myacc.click();
	}
	
	public void clickregbtn() {
		regbtn.click();
	}
	
	public void clickloginbtn() {
		linklogin.click();
	}
}
