package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaHeaderOptionPage extends BasePage1 {

	
	public QaHeaderOptionPage(WebDriver driver) {
		super(driver);
		
	}

	//locator
	@FindBy(xpath = "")
	WebElement phonelink;
	
	
	@FindBy(xpath ="" )
	WebElement myacc;
	
	@FindBy(xpath = "")
	WebElement shoppingcart;
	
	@FindBy(xpath ="" )
	WebElement checkout;
	
	@FindBy(xpath ="" )
	WebElement logooption;
	
	@FindBy(xpath = "")
	WebElement searchbutton;
	
	@FindBy(xpath = "")
	WebElement homebreadcrump;
	
	
	@FindBy(xpath = "")
	WebElement accountbreadcrump;
	
	@FindBy (xpath = "")
	WebElement logoutlink;
	
	@FindBy(xpath = "    //ul[@class='dropdown-menu dropdown-menu-right']//a [text()='Login']")
	WebElement loginoption;
	
	
	
	//method 
	public void clickloginoption() {
		 loginoption.click();
		 
	}
	public boolean isdisplayedLoginoption() {
	    return elementutils.iselementdisplayed(loginoption);
		 
		
		
	}
	public boolean isdisplayedlogoutoption() {
		return    logoutlink.isDisplayed();
		
	}
	public void clicklogout() {
		logoutlink .click();
	}
	public void clickphonelinkoption() {
		 phonelink.click();
	}
	
	public void clickmyaccdropmenu() {
		myacc.click();
	}
	public void clickshoppingcart() {
		myacc.click();
	}
	public void clickcheckout() {
		myacc.click();
	}
	public void clicklogooption() {
		myacc.click();
	}
	public void clicksearchbutton() {
		myacc.click();
	}
	public void clickhomebreadcrump() {
		myacc.click();
	}
	public void clickaccbreadcrump() {
		myacc.click();
	}
}
