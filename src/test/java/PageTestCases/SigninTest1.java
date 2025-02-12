
package PageTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Homepagelc1;
import com.inetbanking.pageObjects.RegisterpageP1;

import BaseTest.BaseClass;

public class SigninTest1  extends BaseClass{
//      WebDriver driver;
//      Properties pro;
      
      
	 
	
	 @Test
	 public void registertest() {
		 
		 Homepagelc1 hpage=new  Homepagelc1(driver);
		 hpage.clickmyacc();
		 hpage.clickregistration();
		 
		 RegisterpageP1 reg=new RegisterpageP1(driver);
		 reg.setusername(pro.getProperty("firstname"));
		 reg.setlastname(pro.getProperty("lastname"));
		 reg.setemail("ramnaikq1763@gmail.com");
		 reg.settle("9568964785");
		 reg.sepass("rau#1423");
		 reg.setconpass("rau#1423");
		 reg.clickcheckbox();
		 reg.clickcontinue();
		 String conmsg = reg.getconfirmationMsg();
		  //  System.out.println(conmsg);
	     Assert.assertEquals( conmsg, "Your Account Has Been Created!"); //validation
		 
		 
	
	 }
}
