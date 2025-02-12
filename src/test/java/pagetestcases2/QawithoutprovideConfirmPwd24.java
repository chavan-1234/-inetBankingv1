package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class QawithoutprovideConfirmPwd24 extends BaseClass2 {
  @Test
  public void verifywithoutprovideconfirmpwd() {
	  
	  
	  QaHomepage hp=new  QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  QaRagisterPage rp=new QaRagisterPage(driver);
	  rp.firstname(null);
	  rp.lastname(null);
	  rp.email(null);
	  rp.telephone(null);
	  rp.password(null);
	  rp.confirmpass(null);
	  rp.checkbox();
	  rp.continuebtn();
	         String errormsgforpwd = rp.conpasswrrormsg();
	         
	  
	  String expmsg="Password confirmation does not match password!";
	  
	  Assert.assertEquals(errormsgforpwd,expmsg );
  }
}
