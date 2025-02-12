package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepagelc1{ //extends BasePage1{
	WebDriver driver;
	
	
	 public Homepagelc1(WebDriver driver) {
	 this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	 
	 //locator
	 @FindBy(xpath = "//span[text()='My Account']")
	 WebElement myaccbutton;
	 
	 @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']/child::li/child::a[text()='Register']") ////a[text='Register']
	 WebElement regbutton;
	 
	 //login
	 @FindBy(xpath = "//ul [@class='dropdown-menu dropdown-menu-right']/child::li/following-sibling::li/child::a")
	 WebElement linklogin;
	 
	 //action method
	 
	 public void clickmyacc() {
		 myaccbutton .click();
		 
		 
	 }
	 public void clickregistration() {
		 regbutton.click(); 
	 }
	 
	public void clicklogin() {
		linklogin.click();
	}

}
