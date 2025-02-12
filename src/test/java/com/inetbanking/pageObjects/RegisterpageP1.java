package com.inetbanking.pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterpageP1{ //extends BasePage1{
	//instance variable
	WebDriver driver;
	WebDriverWait wait;
//	 Actions act;
//	 JavascriptExecutor js;
	//page object class for register separate page
	
	public RegisterpageP1(WebDriver driver){
	this.driver=driver;
	this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
	PageFactory.initElements(driver , this);
		
	}
	
	//locator to find element using  @findBy 
	
    @FindBy(xpath="//input[@id='input-firstname']")
    WebElement txtname;
    
    @FindBy(xpath="//input[@id='input-lastname']")
    WebElement txtlastname;
    
    @FindBy(xpath = "//input[@id='input-email']")
    WebElement txtemail;
    
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement txttele;
    
    @FindBy(xpath = "//input[@id='input-password']")
    WebElement txtpass;
    
    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement txtconfirm;
    
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement chkbox;
    
    @FindBy(xpath = "//input[@type='submit']")
    WebElement conbtn;
    
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement msgconfirmation;
    
    
    //action methods
    
    public void setusername(String un) {
    	txtname.sendKeys(un);
    }
    
    public void setlastname(String ln) {
    	//txtlastname	.sendKeys(ln);
    	
    //	wait.until(ExpectedConditions.visibilityOf(txtlastname));
    	txtlastname	.sendKeys(ln);
    }
    
    public void setemail(String eml) {
    	wait.until(ExpectedConditions.visibilityOf(txtemail));
    	 txtemail.sendKeys(eml);
    }
    public void settle(String tele) {
    	txttele.sendKeys(tele);;
    	
    } 
    	 
    public void sepass(String pass) {
    	txtpass.sendKeys(pass);;
	}
    
    public void setconpass( String conpass) {
    	txtconfirm.sendKeys(conpass);
    }
	  
    public void clickcheckbox() {
    	chkbox.click();
    }
    	 
    public void clickcontinue() {
    		 conbtn.click();
    	 }
    	 
    public String getconfirmationMsg() {
    	try {
    	return msgconfirmation.getText();	 
		} catch (Exception e) {
		
			return e.getMessage();
			
		}
    	   
    }
    
}
