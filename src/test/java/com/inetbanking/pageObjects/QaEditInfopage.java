package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QaEditInfopage extends BasePage1{
       
public	QaEditInfopage(WebDriver driver){
		super(driver);
		
	}

            //loc verify spaces

            @FindBy(xpath = "//input[@id='input-firstname']")
            WebElement firstname;
            
            @FindBy(xpath = "//input[@id='input-lastname']")
            WebElement lasttname;
            
            @FindBy(xpath = "//input[@id='input-email']")
            WebElement email;
              
            @FindBy(xpath = "//input[@id='telephone']")
            WebElement telephone;

             
            //methods 
           
            public String getfirstname() {
            	return firstname.getAttribute("value");
            	
            }
              public String getlastname() {
            	  return lasttname.getAttribute("value");
            	  
             }
              
              public String getemail() {
            	  return email.getAttribute("value");
            	  
              }
              public String gettelephone() {
            	  return telephone.getAttribute("value");
              }
              
              
              
              
              
              

}
