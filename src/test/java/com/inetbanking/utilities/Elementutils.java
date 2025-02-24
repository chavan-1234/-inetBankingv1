package com.inetbanking.utilities;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.inetbanking.testCases.select1;

public class Elementutils {

	 WebDriver driver;
	 
	public  Elementutils (WebDriver driver) {
		this.driver=driver;
		
		
	}
	
	
	
	    public boolean iselementdisplayed(WebElement element) {
	    	
	    	boolean b=false ;
	    	
	    	try {
	    		
	    		
	    		b=element.isDisplayed();
	    		
	    	}
	    	catch (NoSuchElementException e) {
				b=false;
				
			}
	    	return b;
	    	
	  }  //

 public boolean iselementselected(WebElement element) {
	    	
	    	boolean b=false ;
	    	
	    	try {
	    		
	    		
	    		b=element.isSelected();
	    		
	    	}
	    	catch (NoSuchElementException e) {
				b=false;
				
			}
	    	return b;
	    	
	  }  //
 
	    public boolean iselementEnabled(WebElement element) {
	    	
	    	boolean b=false ;
	    	
	    	try {
	    		
	    		
	    		b=element.isEnabled();
	    		
	    	}
	    	catch (NoSuchElementException e) {
				b=false;
				
			}
	    	return b;
	    	
	  }  //
	    
	    
	    
	    
	    public void clickOnElement(WebElement element) {
	    	
	    	  if(iselementdisplayed(element) && iselementEnabled(element) ) {
	    		  element.click();
				
			}
	    }//
	    
	    public String gettextOfElement(WebElement element) {
	    	String text="";
	    	try {
	    		text=element.getText();
	    		
	    	}
	    	catch (NoSuchElementException e) {
				text="";
				
			}
	    	return text;
	    	
	    	
	    }//
	    
	    public void enterdatainfield(WebElement element , String text) {
	    	if(iselementdisplayed(element) && iselementEnabled(element) ) {
	    		element.clear();
	    		element.sendKeys(text);
	    	}
	    }
	    
	    public String getAttributeofelement(WebElement element, String attribute) {
	    	String text="";
	    	try {
	    		element.getAttribute(attribute);
	    		
	    	}
	    	catch (Exception e) {
				text="";
				
			}
	    	return text;
	    	
	    }//
	    
	    public void cleartextfromtextfield(WebElement element) {
	    	if(iselementdisplayed(element) && iselementEnabled(element) ) {
	    		element.clear();
	    	}
	    }//
	    
	/*    public void mouseleftclick(WebElement element) {
	    	Actions action = new Actions(driver);
	    	action.click(element).perform();
	    	
	    	
	    }//
	    
	    public void pressAndHoldKeyboardkeys(Keys key) {
	    	Actions action= new Actions(driver);
	    	action.keyDown(key).perform();
	    }
	    
	    public void presskeyboardkey(String keytext) {
	    	Actions action= new Actions(driver);
	    	action.sendKeys(keytext).perform();
	    }
	    
	    
	    public void releasekeyboardkey(Keys key) {
	    	Actions action= new Actions(driver);
	    	action.keyUp(key).perform();
	    }*/
	    
	      public void pastingtextintofield(WebElement element) {
	    	  Actions action= new Actions(driver);
	    	  action.click(element).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	      }
	    public void copytextfromelement(WebElement element) {
	    	Actions action= new Actions(driver);
	    	action.doubleClick(element).keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).build().perform();
	    }
	    
	    
	    public void selectoptiondropdownfieldusingIndex(WebElement element , int index) {
	    	if(iselementdisplayed(element) && iselementEnabled(element)) {
	    	Select select=new Select(element);
	    	select.selectByIndex(index);
	    	}
	    }
	    public void selectdropdownoptionusingitsvalue(WebElement element , String value) {
	    	if(iselementdisplayed(element) && iselementEnabled(element)) {
	    	Select select=new Select(element);
	    	select.selectByVisibleText(value);
	    }
	    }
	    public int  getElementcount(List<WebElement> elements) {
	    	  int n=0;
	    	  try {
	    		n = elements.size();
	    		  
	    	  }catch (NoSuchElementException e) {
				n=0;
				
			}
	    	  return n;
	    	  
	    	
	    	
	    }
	    
	    public void cleartextfield(WebElement element) {
	    	if(iselementdisplayed(element) &&iselementEnabled(element)) {
	    		element.clear();
	    		
	    	}
	    }
	
	
}
