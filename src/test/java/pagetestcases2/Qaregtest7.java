package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaLoginpage;
import com.inetbanking.pageObjects.QaRegisterpage;

public class Qaregtest7 extends BaseClass2 {
  @Test
  public void checkwaysofregform (){
	 
	  QaHomepage hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  QaRegisterpage reg=new QaRegisterpage(driver) ;
	       boolean checkregister = reg.checkreg();
	       //first way
	       Assert.assertTrue(checkregister);
	       
	       //sec way 
	       QaHomepage hp2=new QaHomepage(driver);
	 	     hp2.clickmyacc();
	 	     hp2.clicklogin();
	 	     
	 	    QaLoginpage lp=new QaLoginpage (driver);
	 	    lp.clickcontinue();
	 	    
	 	   QaRegisterpage reg2=new QaRegisterpage(driver) ;
	         boolean checkreg2 = reg2.checkreg();
	         Assert.assertTrue(checkreg2);
	                            
	       
  }
}
