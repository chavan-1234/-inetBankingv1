package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Override2 extends  OverrideIn_Selenium1{

	WebDriver driver;
      @Override
	public void launchchrome() {
    	  driver=new ChromeDriver();
    	  driver.get("https://www.facebook.com");
		
	}
	
}
