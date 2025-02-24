package pagetestcases2;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaChangepwdpage;
import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaLoginpage;
import com.inetbanking.pageObjects.QaLogoutPage;
import com.inetbanking.pageObjects.QaMyacc2page;
import com.inetbanking.pageObjects.QaRagisterPage;
import com.inetbanking.pageObjects.QaforgotpwdPage;
import com.inetbanking.utilities.Commonutils;

import BaseTest.BaseClass;

public class QaLoginTest  extends  BaseClass{
	         WebDriver driver;
	         

	         QaHomepage hp;
	         QaLoginpage lp;
	         QaMyacc2page ap;
	         QaforgotpwdPage fp;
	         QaChangepwdpage cp;
	         QaLogoutPage logout;
	         QaRagisterPage rp;
	         
	         
	         
	
	              @Parameters({"browser"})
	                @BeforeMethod
	      public void set( String br ) throws IOException {
	        	driver  = openbrowserandapplication( br);
	        	   
	    	       hp=new QaHomepage (driver);
	    	       lp=new QaLoginpage(driver);
	    	    		   
	    	       hp.clickmyacc();
	    	       hp.clicklogin();
	    	       
	    	       
	    	    }
	              
	              @AfterMethod
	              public void teardown() {
	            	  closebrowser(driver);
	            	  
	              }
	      
	              
	              @Test(priority = 1)
	      public void veifyLoginwithValidCredentials() {
	    	  
	    	  Assert. assertTrue(lp.didnavigateloginpage());    // we navigate to login page 
	    	  lp.enterEmail(pro.getProperty(null));
	    	  lp.enterPassword(pro.getProperty(null));
	    	  lp.clicklogin();
	    	  ap=new QaMyacc2page(driver);
	    	  Assert.assertTrue(ap.isuserLogedin());   
	    	  Assert.assertTrue(  ap.didnivigatetoEditYourAccInfo());
	    	  
	    	  }
	              
	              @Test(priority = 2)
	              public void verifyloginwithinvalidcredentials() {
	            	  lp.enterEmail(null);
	            	  lp.enterPassword(null);
	            	  lp.clicklogin();
	            	  
	            	  String expectedmsg="Warning: No match for E-Mail Address and/or Password.";
	            	  Assert.assertEquals(lp.getClass(), expectedmsg);
	            	  
	              }
	              @Test(priority = 3)
	              public void verifyloginwithInvalidunAndValidPwd() {
	            	  lp.enterEmail(null);
	            	  lp.enterPassword(null);
	            	  lp.clicklogin();
	            	  String expectedmsg="Warning: No match for E-Mail Address and/or Password.";
	            	  Assert.assertEquals(lp.getClass(), expectedmsg);
	              }
	              
	              @Test(priority = 4)
	              public void verifyloginwithValidandAndInValidPwd() {
	            	  lp.enterEmail( Commonutils.validemailrandamizegenerator());
	            	  lp.enterPassword(pro.getProperty(null));
	            	  lp.clicklogin();
	            	  String expectedmsg="Warning: No match for E-Mail Address and/or Password.";
	            	  Assert.assertEquals(lp.getClass(), expectedmsg);
	              }
	              
	              @Test(priority = 5)
	              public void verifyloginwithoutanycredentials() {
	            	  
	            	  lp.clicklogin();
	            	  String expectedmsg="Warning: No match for E-Mail Address and/or Password.";
	            	  Assert.assertEquals(lp.getClass(), expectedmsg);
	              }
	              
	              @Test(priority = 6)
	              
	              public void verifyforgotlinkonloginpage() {
	            	 // we navigate to login page
	            	  Assert.assertTrue(  lp.didnavigateloginpage());
	            	  Assert.assertTrue(lp.availablepwdlink());
	            	  lp.clickonforgotpwd();
	            	  
	            	  fp=new  QaforgotpwdPage(driver);
	            	  Assert.assertTrue(fp.didwenavigatetoforgotpage());
	         
	             }
	              
	              
	              @Test(priority = 8)  
	             public void verifyloginfieldplaceholder () {
	            	  lp=new QaLoginpage(driver);
	            	  
	            	  String expectedemailpalceholder="E-Mail Address";
	            	  String expectedpasspalceholder="Password";
	            	  
	            	  Assert.assertEquals(lp.getemailplaceholder(), expectedemailpalceholder);
	            	  Assert.assertEquals(lp.getpwdplaceholder(), expectedpasspalceholder);
	            	  
	              }
	              @Test(priority = 9) 
	              public void verifybrowserbackafterLogin() {
	            	  lp=new QaLoginpage(driver);
	            	  lp.enterEmail(pro.getProperty(null));
	    	    	  lp.enterPassword(pro.getProperty(null));
	    	    	  lp.clicklogin();
	    	    	  driver  = navigateback(driver);
	    	    	   lp.clickrightmyacc();
	    	    	   ap =new QaMyacc2page (driver);
	    	    	  Assert.assertTrue(ap.isuserLogedin());
	    	    	   
	    	    	   
	              }
	              @Test(priority = 10) 
	             public void verifyloggingoutAndBrowserback() {
	            	  lp.enterEmail(pro.getProperty(null));
	    	    	  lp.enterPassword(pro.getProperty(null));
	    	    	  lp.clicklogin();
	    	    	  ap=new QaMyacc2page(driver);
	    	    	  ap.clicklogout();
	    	    	driver   =navigateback(driver);
	    	    	ap=new QaMyacc2page(driver);
	    	    	  ap.clickeditinfo();
	    	    	  
	    	    	  lp=new QaLoginpage(driver);
	    	    Assert.assertTrue(lp.didnavigateloginpage());	  
	              }
	              
	              @Test(priority = 12)
	              
	              public void verifynumberofunsuccesfulloginattempts() {
	            	  lp=new QaLoginpage(driver);
	            	  lp.enterEmail(null);
	            	  lp.enterPassword(null);
	            	  lp.clicklogin();
	            	  lp.clicklogin();
	            	  lp.clicklogin();
	            	  lp.clicklogin();
	            	  lp.clicklogin();
	            	  lp.clicklogin();
	            	  String expectedwar="your accout has exeeded aloowd number of login attempts";
	            //	  Assert.assertEquals(lp.getwarningmsg(),expectedwar );
	              }
	              @Test(priority = 13)
	              
	             public void verifyloginpwdfieldhideitsvisibility() {
	            	  lp=new QaLoginpage(driver);
	            	  String expectedtype="password";
	            	  Assert.assertEquals(lp.getpwdfiledtype(),  expectedtype);
	            	  
	              }
	              
	              @Test(priority = 14)
	              
	             public void verifycopyingtextintopwdfield() {
	            	  lp=new QaLoginpage(driver);
	            	  String pass="45689";
	            	  
	            	  lp.enterPassword(pass);
	            	  lp.copyingpwdfieldtext(driver);
	            	  lp.pastecopytextpwdfieldintoemailfield(driver);
	            	  
	            	  Assert.assertNotEquals(lp.getcopytextintoemialfield(),pass );
	              }
	              
	              @Test(priority = 15)
	            public void verifypwdisStoredInHtmlcodeofthepage()  {
	            	  lp=new  QaLoginpage(driver);
	            	  String pass="256325";
	            	  
	            	  lp.enterPassword(pass);
	            	  
	            	  Assert.assertFalse(gethtmlpagecode().contains(pass));
	            	  lp.clicklogin();
	            	  Assert.assertFalse(gethtmlpagecode().contains(pass));
	            	  
	              }
	              @Test(priority = 16)
	              
	              public void verifyLoginIntoappAfetrChangingPassword() {
	            	  lp=new  QaLoginpage(driver);
	            	  lp.enterEmail(pro.getProperty("email"));
	            	  lp.enterPassword(pro.getProperty("pass"));  //old
	            	  lp.clicklogin();
	            	  ap=new   QaMyacc2page(driver);
	            	  ap.clickchangepass();
	            	  cp=new QaChangepwdpage(driver);
	            	  cp.enterpass(null); //new
	            	  cp.enterconfirmpass(null);
	            	  cp.clickcontinuebtn();
	            	  String expectedmsg="Success: Your password has been successfully updated.";
	            	  ap=new QaMyacc2page(driver);
	                 Assert.assertEquals(ap.getsuccmsg(),expectedmsg);
	            	  ap.clicklogout();
	            	  logout=new QaLogoutPage (driver);
	            	  logout.clickmyacc();
	            	  logout.clicklogin();
	            	  lp=new  QaLoginpage(driver);
	            	  lp.enterEmail(null);
	            	  lp.enterPassword(null);  //enter old pwd  user should not login
	            	  
	            	  lp.clicklogin();
	            	  String warmsg="Warning: No match for E-Mail Address and/or Password.";
	            	  
	            	  Assert.assertEquals(lp.getwrningmsg(), warmsg);  //pass
	            	  lp.clearpwd();
	            	  lp.enterPassword(null); //enter new user should login
	            	Assert.assertTrue(ap.isuserLogedin()); //true user login 
	              }
	              
	              @Test(priority = 16)
	              
	       public void  verifymultiplewaysofnavigatetoliginpage() {
	            	  //1
	            	  lp  = new QaLoginpage(driver);
	            	  lp.clickcontinue();
	            	  rp=new QaRagisterPage(driver);
	            	  rp.clickloginpagelink();
	            	  Assert.assertTrue(lp.didnavigateloginpage());
	            	  
	            	  //2
	            	    lp  = new QaLoginpage(driver);
	            	   lp.clickrightsideloginoption();
	            	   
	            	   Assert.assertTrue(lp.didnavigateloginpage());
	            	   
	            	   //3
	            	       hp = new QaHomepage(driver);
	            	       hp.clickmyacc();
	            	       hp.clicklogin();
	            	       Assert.assertTrue(lp.didnavigateloginpage());
	              }
	              
	              
	              
	              
	              
}
