package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaRegisterpage extends BasePage1 {
       
  public QaRegisterpage( WebDriver driver){
		super(driver);
		
	}
	 //loc
   
          @FindBy(xpath = "//ul[@class='breadcrumb']/descendant::a[text()='Register']")
           WebElement reglink;
          
          
            //method
          
          public boolean checkreg() {
        	  return reglink.isDisplayed();
        	  
          }
          
          
          
   
}


    