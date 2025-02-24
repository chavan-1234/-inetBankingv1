package pagetestcases2;

import static org.testng.Assert.fail;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.HeaderoptionPage;
import com.inetbanking.pageObjects.QaAccSuccesPage;
import com.inetbanking.pageObjects.QaContactusPage;
import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaLoginpage;
import com.inetbanking.pageObjects.QaRagisterPage;
import com.inetbanking.pageObjects.QaShoppingcartPage;
import com.inetbanking.utilities.Commonutils;

public class QaRefTest1  extends  BaseClass2 {
	//global
	QaRagisterPage reg;
	QaHomepage hp;
	QaContactusPage ca;
	QaLoginpage lp;
	 QaShoppingcartPage sp;
	 HeaderoptionPage headerpage;
	 
	
	             @BeforeMethod
	            public void set() throws IOException {
	            	openbrowserandapplication("crome");
	            	   hp=new QaHomepage(driver);
	            	   hp.clickmyacc();
	                   hp.clickregister();
	            }
	 
  @Test(priority = 1)
  public void regpagecheckallfields() {
	  hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  
	  
	   reg =new QaRagisterPage(driver);
	  
	  reg.myacc();
	  reg.register();
	  reg.firstname(pro.getProperty(null));
	  reg.lastname(pro.getProperty(null));
	  reg.email(pro.getProperty( Commonutils.validemailrandamizegenerator()));
	  reg.telephone(pro.getProperty(null));
	  reg.password(pro.getProperty(null));
	  reg.confirmpass(pro.getProperty(null));
	  reg.checkbox();
	  reg.continuebtn();
	  
	  QaAccSuccesPage myacc= new QaAccSuccesPage(driver);
	             boolean msgcon = myacc.successmsgconfirm();
	             boolean logoutlink = myacc.clicklogout();
	     
	             Assert.assertTrue(msgcon); 
	             Assert.assertTrue(logoutlink);
	  
	  
  }
  
          @Test(priority =2 , dependsOnMethods = {"regpagecheckallfields"}  )
  
          public void   checkpolicyfield() {
              hp=new QaHomepage(driver);
        	  hp.clickmyacc();
        	  hp.clickregister();
        	  
        	    reg=new QaRagisterPage(driver);
        	  
        	  
        	  Assert.assertFalse(reg.isprivacypolicyselected());  //true
          }
          
          
        @Test(priority = 3 , dataProvider = "ajay")
        
        public void verifyRegAccWithoutProvidingPrivacypolicy() {
        	  hp=new QaHomepage(driver);
        	  hp.clickmyacc();
        	  hp.clickregister();
        	 	reg =new QaRagisterPage(driver);
        	 reg.firstname(pro.getProperty(null));
       	     reg.lastname(pro.getProperty(null));
         	  reg.email(pro.getProperty(null));
        	  reg.telephone(pro.getProperty(null));
       	     reg.password(pro.getProperty(null));
         	  reg.confirmpass(pro.getProperty(null));
         	  reg.checkbox();
          	  reg.continuebtn();
        	
          	 String expectedwaringmsg="Warning: You must agree to the Privacy Policy!";
          	      
          	     Assert.assertEquals(reg.getprivacypolicywarning(),expectedwaringmsg );
        }
        
        
       
        @Test(priority = 4)
        
        
        public void verifypassFieldhide() {
        	 hp=new QaHomepage(driver);
       	  hp.clickmyacc();
       	  hp.clickregister();
        	reg =new QaRagisterPage(driver);
       
       
       	Assert.assertEquals(reg.getpasstype(),"password");
       	Assert.assertEquals(reg.getconpasstype(), "password");
       	  
       	  
        }
        
        @Test(priority = 4)
             public void VerifyallLinksOnRegPage() {
        	reg =new QaRagisterPage(driver);
        	 driver  = reg.getdriverfromregpage();
        	 headerpage  = new  HeaderoptionPage(driver);
        	
         	  
         	
        	 headerpage.clickphonelink();  
             ca=new  QaContactusPage(driver);
             Assert.assertTrue(ca.didwenavigatetocontactus());	
             driver  = navigateback(driver);
            
            
            reg =new QaRagisterPage(driver);
            driver  = reg.getdriverfromregpage();
            headerpage  = new  HeaderoptionPage(driver);
            headerpage .clickwishlistlink();
       	       
       	       lp=new QaLoginpage(driver);
       	      
       	    Assert.assertTrue( lp.didnavigateloginpage());
       	     driver   = navigateback(driver);
       	        
       	        
       	        
       	     reg =new QaRagisterPage(driver);
       	  driver  = reg.getdriverfromregpage();
       	headerpage  = new  HeaderoptionPage(driver);
    	headerpage .clickshoppingcartlink();
       	          
       	           sp=new QaShoppingcartPage(driver);
       	           
       	           
       	        Assert.assertTrue(sp.didnavigateshoppingcart()); 
       	        driver  = navigateback(driver);
       	        
       	        
       	     reg =new QaRagisterPage(driver);
       	    driver  = reg.getdriverfromregpage();
       		headerpage  = new  HeaderoptionPage(driver);
           	 
       		    headerpage .clickcheckoutLink();
       	     
       	       Assert.assertTrue(sp.didnavigateshoppingcart());
       	    driver  = navigateback(driver);
       	    
       	      reg =new QaRagisterPage(driver);
       	   driver  = reg.getdriverfromregpage();
      		headerpage  = new  HeaderoptionPage(driver);
      		headerpage   .clickprivacypolicylink();
       	  boolean xopdisplay = reg.waitandcheckDisplaystatusofcloseprivacyoption(driver, 10);
       	      
       	        Assert.assertTrue(xopdisplay);//true
       	        
       	        reg.clickxoption();
       	      
       	    
        	
             }
        
        @Test
        
             public void verifyregAccWithoutprovidingpassAnd() {
        	
        	
         	  
       	    
       	  reg =new QaRagisterPage(driver);
    	
    	 
    	  
    	  reg.myacc();
    	  reg.register();
    	  reg.firstname(pro.getProperty(null));
    	  reg.lastname(pro.getProperty(null));
    	  reg.email(pro.getProperty(null));
    	  reg.telephone(pro.getProperty(null));
//    	  reg.password(pro.getProperty(null));
//    	  reg.confirmpass(pro.getProperty(null));
    	  reg.checkbox();
    	  reg.continuebtn();
    	  
    	  String Expectederror="Password must be between 4 and 20 characters!";
    	  Assert.assertEquals(reg.getpassworderror(), Expectederror);
        	
        }
        
        
  
}
