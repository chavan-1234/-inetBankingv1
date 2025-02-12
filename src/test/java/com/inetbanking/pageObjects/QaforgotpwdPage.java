package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaforgotpwdPage extends BasePage1{
	
           public QaforgotpwdPage (WebDriver driver) {
        	   super(driver);
        	   
           }
           
           @FindBy(xpath = "//ul[@class='breadcrumb']/descendant::a[text()='Forgotten Password']")
           WebElement forgotbreadcrump;
           
          // ------------------ 
           public boolean didwenavigatetoforgotpage() {
        	   return forgotbreadcrump.isDisplayed();
        	   
           }
}
