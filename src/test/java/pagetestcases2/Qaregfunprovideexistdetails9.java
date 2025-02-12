package pagetestcases2;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class Qaregfunprovideexistdetails9 extends  BaseClass2{
  @Test
  public void regprovideexistdetails() {
	  QaHomepage hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  QaRagisterPage regpage=new QaRagisterPage(driver);
	  regpage.firstname(null);
	  regpage.lastname(null);
	  regpage.email(null);
	  regpage.telephone(null);
	  regpage.password(null);
	  regpage.confirmpass(null);
	  regpage.checkbox();
	  regpage.confirmbtn();
	        String errormssg = regpage.errormsg();
	  
	   String expectederrormsg = "Warning: E-Mail Address is already registered!";
	   
	   Assert.assertEquals(errormssg, expectederrormsg );
	  
  }
}
