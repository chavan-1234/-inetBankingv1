package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaMyacc2page {

	WebDriver driver;
	
	public QaMyacc2page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locator
	
	 @FindBy(xpath = "//span[@class='input-group-btn']/child::button")
	  WebElement searchbutton;
	 @FindBy(xpath = "//input[@name='search']")
	   WebElement searchbox;
	@FindBy(xpath = "//a[text()='Edit your account information']")
	WebElement editInformation;
	
	
	@FindBy(xpath = "//a[text()='Subscribe / unsubscribe to newsletter']")
	WebElement subAndNewsSubsLink;
	
	@FindBy(xpath = "//div[@class='list-group']/child::a[text()='Logout']")
	WebElement logoutoption;
	
	@FindBy(xpath = "//a[text()='Change your password']")
	WebElement changeyourpassword;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement succmsg;
	
	
	//action method
	public WebDriver getdriver() {
		return driver;
		
	}
	public String getsuccmsg() {
		return succmsg.getText();
		
	}
	public void clickchangepass() {
		 changeyourpassword.click();
	}
	
	public void clicklogout() {
		logoutoption.click();
		
	}
	public void clickeditinfo() {
		editInformation.click();
		
	}
	
	public boolean didnivigatetoEditYourAccInfo() {
		return editInformation.isDisplayed();
	}
	
	public void clicknewsletterlink() {
		 subAndNewsSubsLink.click();
	}
	
	public boolean   isuserLogedin() {
	return logoutoption.isDisplayed();
	
	}
	public void enterproductintosearchfield(String pro){
		  searchbox.sendKeys(pro);
	  }
	  public void clicksearchbutton() {
		  searchbutton.click();
	  }
	
	
}
