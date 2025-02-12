package com.inetbanking.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class QaRagisterPage {
         WebDriver driver;
         
public 	QaRagisterPage(WebDriver driver){
						
		this. driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	//locator 
	
	  @FindBy(xpath = "//span[text()='My Account']")
	  WebElement myacc;
	  
	  @FindBy(xpath = "//a[text()='Register']")
	  WebElement reg;
	    // locator for inputfield
	  @FindBy(xpath = "//input[@id='input-firstname']")
	  WebElement firstname;
	  @FindBy(xpath = "//input[@id='input-lastname']")
	  WebElement lastname;
	  @FindBy(xpath = "//input[@id='input-email']")
	  WebElement email;
	  @FindBy(xpath = "//input[@id='input-telephone']")
	  WebElement telephone;
	  @FindBy(xpath = "//input[@id='input-password']")
	  WebElement password;
	  @FindBy(xpath = "//input[@id='input-confirm']")
	  WebElement confirmpass;
	  @FindBy(xpath = "//input[@id='//input[@type='checkbox']")
	  WebElement checkbox;
	  
	  @FindBy(xpath = "//input[@type='checkbox']")
	  WebElement privacypolicy;
	  
	  
	  @FindBy(xpath = "//input[@type='submit']")
	  WebElement conbtn;
	  
	  @FindBy(xpath = "//i[@class='fa fa-phone']")
	  WebElement phonelink;
	  
	  @FindBy(xpath="//span  [text()  ='Wish List (0)']")
	  WebElement wishlistlink;
	  
	  @FindBy(xpath = "//span[text()='Shopping Cart']")
	  WebElement shoppingcartlink;
	  
	  @FindBy(xpath = "//span[text()='Checkout']")
	  WebElement checkoutlink;
	  
	  @FindBy(xpath = "//a[@class='agree']/child::b[text()='Privacy Policy']")
	  WebElement privacypolicylink;
	  
	  @FindBy(xpath = "//button[text()='×']")
	  WebElement privacypolicyclosebutton;
	  
	  
	  @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	  WebElement errormsg;
	  
	    //  locator for error msg
	  @FindBy(xpath = "//div[text()='First Name must be between 1 and 32 characters!']")
	  WebElement firstNameError;
	  
	  @FindBy(xpath = "//div[text()='Last Name must be between 1 and 32 characters!']")
	  WebElement lastNameError;
	  
	  @FindBy(xpath = "//div[text()='E-Mail Address does not appear to be valid!']")
	  WebElement emailError;
	  
	  @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
	  WebElement telephoneError;
	  
	  @FindBy(xpath = "//div[text()='Telephone must be between 3 and 32 characters!']")
	  WebElement passError ;
	  
	  @FindBy(xpath = "//div[text()='Password confirmation does not match password!']")
	  WebElement confirmpwderror;
	  
	  
	  
	  
	  //action method
	  public void myacc() {
		  myacc.click();
	  }
	  public void register() {
		  reg.click();
	  }
	    // methods for interacting with elements
	  public void firstname(String name) {
		  firstname.sendKeys(name);
		  
	  }

	  public void lastname(String ln) {
		  lastname.sendKeys(ln);
	  }

	  public void email(String eml) {
		  email.sendKeys(eml);
	  }

	  public void telephone(String tele) {
		  telephone.sendKeys(tele);
	  }

	  public void password(String pwd) {
		 password.sendKeys(pwd); 
	  }

	  public void confirmpass(String con) {
		  confirmpass.sendKeys(con);
	  }
	  
	  public void checkbox() {
		  checkbox.click();;
	  }
	  
	  public void continuebtn() {
		  conbtn.click();
	  }
	  
	  public boolean   isprivacypolicyselected() {
		return  privacypolicy.isSelected();
		  
	  }
	  
	  //---------------
	  
	  public String errormsg() {
		  return errormsg.getText();
		  
	  }
	  
	  
	  public String conpasswrrormsg() {
		 return confirmpwderror.getText();
		 
	  }
	  // -------------------
	  
	  //get placeholder text
	  
	  public String getfirstnameph() {
		 return firstname.getAttribute("placeholder");
		  
	  }
	  
	  public String getlastnameph() {
			 return lastname.getAttribute("placeholder");
			  
		  }

	  public String getemailph() {
			 return email.getAttribute("placeholder");
			  
		  }
	  public String getteleph() {
			 return telephone.getAttribute("placeholder");
			  
		  }

	  public String getpassph() {
			 return password.getAttribute("placeholder");
			  
		  }

	  public String getconfpwdph() {
			 return confirmpass.getAttribute("placeholder");
			  
		  }
	  
	  //get error massage
	  
	  public String getFirstnameerror() {
		 return  firstNameError.getText();
	  }
	  

	  public String getLastnameerror() {
		 return  lastNameError .getText();
	  }
	  

	  public String getEmailerror() {
		 return   emailError .getText();
	  }
	  

	  public String getteleerror() {
		 return  telephoneError.getText();
	  }

	  public String getpassworderror() {
		 return  passError .getText();
	  }
	  
	  public String getprivacypolicywarning() {
		  return  privacypolicy.getText();
		  
		  
	 }
	  
	  // method for pass type
	  
	  public String getpasstype() {
		   return  password.getAttribute("type");
		  
	  }
	  
	  public String getconpasstype() {
		   return  confirmpass.getAttribute("type");
		  
	  }
	  
	  //    link methods
	  
	  public void clickphonelink() {
		  phonelink.click();
	  }
	  
	  public void clickwishlistlink() {
		  wishlistlink.click();
	  }
	  
	  public void clickShoppingCartLink() {
		  shoppingcartlink.click();
	  }
	  
	  public void clickchekoutLink() {
		  checkoutlink.click();
	  }
	  
	  public void clickprivacylink() {
		  privacypolicylink  .click();
	  }
	  public boolean waitandcheckDisplaystatusofcloseprivacyoption(WebDriver driver, int sec) {
		  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
		  wait.until(ExpectedConditions.visibilityOf(privacypolicyclosebutton));
		  return privacypolicyclosebutton.isDisplayed();
		  
	  }
	  public void clickxoption() {
		  privacypolicyclosebutton.click();
	  }
	  
}
