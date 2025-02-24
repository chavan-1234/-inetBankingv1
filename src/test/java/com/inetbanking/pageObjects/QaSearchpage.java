package com.inetbanking.pageObjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.inetbanking.utilities.Elementutils;

public class QaSearchpage extends BasePage1 {
	   
	  public QaSearchpage(WebDriver driver) {
		  
		 super(driver);
		 
		 
		 
		 
		  
	  }
	  
	  
	  @FindBy(xpath = "//p[text()='There is no product that matches the search criteria.']")
	  WebElement noproducterrormsg;
	  
	  @FindBy(xpath = "//h1[text()='Search - apple']")
	  WebElement searchrandomproductnameheader;
	  
	  @FindBy (xpath = "//div[@class='product-thumb']")
	 List<WebElement>  numberofproduct;
	  
	  @FindBy(xpath = "//input[@id='input-search']")
	  WebElement searchcrieteriafield;
	  @FindBy(xpath = "//select[@name='category_id']")
	  WebElement categorydropdownfield;
	  
	  @FindBy(xpath = "//input[@id='button-search']")
	  WebElement searchbutton;
	  
	  
	  public void clicksearchbutton() {
		  elementutils.clickOnElement(searchbutton);
	  }
	  
	  public void entersearchcrieteriafield (String data) {
		  elementutils.enterdatainfield(searchcrieteriafield, data);
	  }
		  
	  
	  
	  public int getNoofProductsDisplayInsearchResult() {
		return  elementutils.getElementcount(numberofproduct);
		  
         }
	  
	  
	  
	  public String  isheaderproductnamedisplay(){
		 return  elementutils. gettextOfElement(searchrandomproductnameheader);
	  }

	  
	  
	  public String getnoproductmsg() {
		   return elementutils. gettextOfElement(noproducterrormsg);
		  
	  }	 
	  
	  public void selectoptiofromcategoryfeild(int index) {
		  elementutils.selectoptiondropdownfieldusingIndex(categorydropdownfield, index);
		  
		  
	  }
	  
	  
}
