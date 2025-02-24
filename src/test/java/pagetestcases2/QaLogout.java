package pagetestcases2;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaAccountLogoutpage;
import com.inetbanking.pageObjects.QaHeaderOptionPage;
import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaLoginpage;
import com.inetbanking.pageObjects.QaMyacc2page;
import com.inetbanking.pageObjects.QaRightsightOption;

import BaseTest.BaseClass;

public class QaLogout extends BaseClass{
           WebDriver driver;
           QaHomepage hp;
           QaLoginpage lp;
           QaMyacc2page myacc2;
           QaHeaderOptionPage headerpage;
           QaAccountLogoutpage myacclogoutpage;
           QaRightsightOption rightsideop ;
           
           
	
	           @BeforeMethod
	           public void setup() throws IOException {
	        	 driver  =openbrowserandapplication("chrome");
	        	  hp =new QaHomepage(driver);
	        	 
	        	   
	           }
	           
	           @AfterMethod 
	           public void teardown() {
	        	   closebrowser(driver);
	        	   
	        		   
	        	   }
	        	   
	           
	         @Test
	        public void VerifyloggingoutUsingmyaccdropmenu() {
	        	 hp =new QaHomepage(driver);
	        	 hp.clickmyacc();
	        	 hp.clicklogin();
	        	lp=new QaLoginpage(driver) ;
	        	lp.enterEmail(pro.getProperty("email"));
	        	lp.enterPassword(pro.getProperty("pass"));
	        	lp.clicklogin();
	        	myacc2=new  QaMyacc2page (driver);
	        	driver  =myacc2.getdriver();
	        	 headerpage=new  QaHeaderOptionPage(driver);
	        	 headerpage.clickmyaccdropmenu();
	        	 headerpage.clicklogout();
	        	 myacclogoutpage=new QaAccountLogoutpage(driver);
	        	Assert.assertTrue( myacclogoutpage.isaccheadingdisplay());
	        	myacclogoutpage =new QaAccountLogoutpage(driver);
	        	     driver       =myacclogoutpage.getdriver();
	        	headerpage=new  QaHeaderOptionPage(driver);
	        	headerpage.clickmyaccdropmenu();
	        Assert.assertTrue(headerpage.isdisplayedLoginoption());	
	       driver   = headerpage.getdriver();
	       
	       myacclogoutpage=new QaAccountLogoutpage(driver);
	       myacclogoutpage.clickcontinuebutton();
	                hp =new QaHomepage(driver);
	            driver  = hp.getdriver();
	                
	              Assert.assertEquals(getpageurl(driver), pro.getProperty("url"));
	                
	        	
	         }
	         public void verifyloggingoutusingrightcoloption() {
	        	 hp=new QaHomepage(driver);
	        	 hp.clickmyacc();
	        	 hp.clicklogin();
	        	 lp=new QaLoginpage(driver);
	        	 lp.enterEmail(null);
	        	 lp.enterPassword(null);
	        	 lp.clicklogin();
	        	 myacc2= new QaMyacc2page (driver);
	        	  driver    = myacc2.getdriver();
	        	     rightsideop   =new  QaRightsightOption(driver);
	        	     rightsideop.clickrightlogout();
	        	     myacclogoutpage    = new  QaAccountLogoutpage(driver);
	        	  driver  =  myacclogoutpage.getdriver();
	        	  headerpage=new  QaHeaderOptionPage(driver);
	        	  headerpage.clickmyaccdropmenu();
	        	 Assert.assertTrue( headerpage.isdisplayedLoginoption());
	        	driver     =headerpage.getdriver();
	        	 
	        	 myacclogoutpage    = new  QaAccountLogoutpage(driver);
	        	      Assert.assertTrue( myacclogoutpage .isaccheadingdisplay());
	        	      
	        	      myacclogoutpage  .clickcontinuebutton();
	        	      hp=new QaHomepage(driver);
	        	      Assert.assertEquals(getpageurl(hp.getdriver()), pro.getProperty("url"));
	        	      
	         }
	         public void loggingoutandbrowserback() {
	        	 
	         }
	         public void verifythereisnologoutoptionbeforelogin() {
	        	 
	         }
 
}
