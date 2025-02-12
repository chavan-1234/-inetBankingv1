package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginddtPage1 extends BasePage1  {
	   
  public	   LoginddtPage1(WebDriver driver){
		super(driver);
		
	}
	   
	    //locator
	   
	   @FindBy(xpath = "//input[@id='input-email']")
	   WebElement txtemail;
	   
	   @FindBy(xpath = "//input[@id='input-password']")
	   WebElement txtpass;
	   
	   @FindBy(xpath = "//input[tn;@value='Login']")
	   WebElement loginbtn;
	   
	   
	   //action methods
	   
	   public void setemail(String un) {
		   txtemail.sendKeys(un);
	   }
	   
	   public  void setpassword(String pwd) {
		   txtpass.sendKeys(pwd);
	   }
	   
	   public void clicklgn() {
		   loginbtn.click();
	   }
	   
	 
	 

}
