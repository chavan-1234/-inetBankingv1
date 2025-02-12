package PageTestCases;


import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Homepagelc1;
import com.inetbanking.pageObjects.Loginpagepavan;

import BaseTest.BaseClass;

public class LoginTestPavan extends  BaseClass {
    
	
	 @Test(priority = 1, groups= {"regression"})
	 public void verify_Login() throws InterruptedException {
		 
		 Homepagelc1 h1=new Homepagelc1(driver);
		 h1.clickmyacc();
		 h1.clicklogin();
		 
		 Loginpagepavan lp=new Loginpagepavan(driver);
		 lp.setemail(pro.getProperty("email"));
		 lp.setpassword(pro.getProperty("pass"));
		 lp.clicklogin();
		 
		 
		 
		 
		 
		 
	 }
	      
	
	
}
