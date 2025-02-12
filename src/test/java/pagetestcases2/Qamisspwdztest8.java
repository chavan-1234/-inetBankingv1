package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;
import com.inetbanking.pageObjects.QamismatchpasswordPage;

public class Qamisspwdztest8 extends BaseClass2 {
  @Test
  public void checkmisspwd() {
	  
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
	  
	  QamismatchpasswordPage misspwd=new QamismatchpasswordPage(driver);
	          String misspwdword = misspwd.misspwdmsg();
	  
	          String expectedmsg = "Password confirmation does not match password!";
	  Assert.assertEquals(misspwdword, expectedmsg);
	  
  }
}
