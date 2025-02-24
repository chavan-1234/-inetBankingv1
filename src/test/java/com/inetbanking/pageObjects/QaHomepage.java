package com.inetbanking.pageObjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QaHomepage extends BasePage1{
	public QaHomepage(WebDriver driver) {
		super(driver);
		
	}
//         
//	WebDriver driver;
//	
//	  public QaHomepage(WebDriver driver) {
//		  this.driver=driver;
//		  PageFactory.initElements(driver,this);
//	  }
	  
	  //loc
	  
	  @FindBy(xpath = "//span[text()='My Account']")
	  WebElement myacc;
	  
	  @FindBy(xpath = "//a[text()='Register']")
	  WebElement reg;
	  
	  @FindBy(xpath = "//li[@class='dropdown open']/descendant::a[text()='Login']")
	  WebElement login;
	  
	  @FindBy(xpath = "//input[@name='search']")
	   WebElement searchbox;
	  
	  @FindBy(xpath = "//span[@class='input-group-btn']/child::button")
	  WebElement searchbutton;
	  
	   
	  @FindBy(tagName = "a")
	List< WebElement> links;
	  
	  //method
	  public String getsearchfieldpalceholder() {
		  String searchplaceholder=null;
		  
		  try {
			  searchplaceholder =searchbox.getAttribute("placeholder");
		  }catch (NoSuchElementException e) {
			  searchplaceholder=null;
			  
		}
		  return searchplaceholder;
		    }
	  
	  
	  public void clicksearchbutton() {
		  searchbutton.click();
	  }
	  public void enterproductintosearchfield(String pro){
		  searchbox.sendKeys(pro);
	  }
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