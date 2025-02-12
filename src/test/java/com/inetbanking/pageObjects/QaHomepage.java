package com.inetbanking.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaHomepage {
         
	WebDriver driver;
	
	  public QaHomepage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver,this);
	  }
	  
	  //loc
	  
	  @FindBy(xpath = "//span[text()='My Account']")
	  WebElement myacc;
	  
	  @FindBy(xpath = "//a[text()='Register']")
	  WebElement reg;
	  
	  @FindBy(xpath = "//li[@class='dropdown open']/descendant::a[text()='Login']")
	  WebElement login;
	  
	  @FindBy(tagName = "a")
	List< WebElement> links;
	  
	  //method
	  
	  public void clickmyacc() {
		  myacc.click();
	  }
       public void clickregister() {
		 reg.click(); 
	  }
       
       public void clicklogin() {
    	   login.click(); 
  	  }
       
       public List<WebElement> getlinks() {
    	   return links;
    	   
       }
}