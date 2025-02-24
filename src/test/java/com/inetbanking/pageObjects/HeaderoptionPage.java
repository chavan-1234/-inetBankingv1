package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderoptionPage extends BasePage1{
	
	
	public HeaderoptionPage(WebDriver driver) {
		super(driver);
		
	}

	 @FindBy(xpath = "//i[@class='fa fa-phone']")
	  WebElement phonelink;
	 @FindBy(xpath = "//span[text()='My Account']")
	 WebElement myaccoption;
	 
	  
	  @FindBy(xpath="//span  [text()  ='Wish List (0)']")
	  WebElement wishlistlink;
	  
	  @FindBy(xpath = "//span[text()='Shopping Cart']")
	  WebElement shoppingcartlink;
	  
	  @FindBy(xpath = "//span[text()='Checkout']")
	  WebElement checkoutlink;
	  
	  @FindBy(xpath = "//a[@class='agree']/child::b[text()='Privacy Policy']")
	  WebElement privacypolicylink;
	  @FindBy(xpath = "//a[text()='Login']")
	  WebElement loginoption;
	  
	  
	  
	  
	  public void clicklogin() {
		  loginoption.click();
		  
	  }
	       public void clickmyaccheader() {
	    	   myaccoption.click();
	    	   
	       }
	            public void clickphonelink() {
	            	phonelink.click();
	  }
            public void clickwishlistlink() {
            	wishlistlink.click();
	  }
               public void clickshoppingcartlink() {
            	   shoppingcartlink.click();
                 }
               
               
               public void clickcheckoutLink() {
            	   checkoutlink.click();
         	  }
               public void clickprivacypolicylink() {
            	   privacypolicylink.click();
         	  }
               
               
               
               
               
               
               
}
