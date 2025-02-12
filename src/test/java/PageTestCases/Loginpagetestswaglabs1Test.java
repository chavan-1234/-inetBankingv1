package PageTestCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginpageSwaglabs1;

import BaseTest.BaseClass;

public class Loginpagetestswaglabs1Test extends BaseClass {
  @Test
  public void verifylogin() throws InterruptedException {
	  
	  LoginpageSwaglabs1 lp=new LoginpageSwaglabs1(driver);
	  lp.setusername("standard_user");
	  lp.setpassword("secret_sauce");
	  lp.clickloginbtn();
	  
	  
	  
	  
  }
}
