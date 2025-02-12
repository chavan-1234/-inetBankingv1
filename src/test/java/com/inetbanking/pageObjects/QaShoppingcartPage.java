package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaShoppingcartPage extends BasePage1{

	
	 public QaShoppingcartPage (WebDriver driver) {
		 super(driver);
		 
	 }
	 
	 @FindBy(xpath = "//a[text()='Shopping Cart']")
	 WebElement shoppingcartbreadcrump;
	 
	 
	 
	 
	 public boolean didnavigateshoppingcart() {
		 return    shoppingcartbreadcrump.isDisplayed();
		 
	 }
}
