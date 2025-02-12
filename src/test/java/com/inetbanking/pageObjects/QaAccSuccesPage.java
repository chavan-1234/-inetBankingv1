package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaAccSuccesPage {
      WebDriver driver;
      
  public	QaAccSuccesPage(WebDriver driver)   {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//locator
	@FindBy(xpath = "//div[@id='content']/h1")
	WebElement succesmsg;
	
	@FindBy(xpath = "//div[@class='list-group']/descendant::a[text()='Logout']")
	WebElement logoutbtn;
	
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement contiunebtn;
	
	
	// methods
	
	public boolean successmsgconfirm() {  // method return true or flase
		
		try {
			return succesmsg.isDisplayed();
		}
		catch (Exception e) {
			return false;
			
		}
		
	}
	public boolean clicklogout() {
		return logoutbtn.isDisplayed();
		
	}
	
	public void clickcontinuebtn() {
		contiunebtn.click();
	}
	
	
}
