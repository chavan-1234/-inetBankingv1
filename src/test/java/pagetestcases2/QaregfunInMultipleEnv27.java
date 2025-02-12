package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaAccSuccesPage;
import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;



public class QaregfunInMultipleEnv27 extends  BaseClass2 {
  @Test
  public void checkregpageondiffenv() {
	  
	  QaHomepage hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  //reg page
	  QaRagisterPage rp=new  QaRagisterPage(driver);
	  rp.firstname(null);
	  rp.lastname(null);
	  rp.email(null);
	  rp.telephone(null);
	  rp.password(null);
	  rp.confirmpass(null);
	  rp.checkbox();
	  rp.continuebtn();
	  
	  
	  QaAccSuccesPage accsucces=new QaAccSuccesPage(driver);
	          boolean succmsg = accsucces.successmsgconfirm();
	          boolean logoutexpected = accsucces.clicklogout();
	          
	  Assert.assertTrue(succmsg);   //true
	  Assert.assertTrue(logoutexpected);  //true
	  
	  
	  
	  
	  
	  }
}
