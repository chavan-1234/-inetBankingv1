package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaMyacc2page;
import com.inetbanking.pageObjects.QaAccSuccesPage;
import com.inetbanking.pageObjects.QaNewslaterPage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class QaregTest5 extends BaseClass2 {
  @Test
  public void regyesoptioncheck() {
	  
	  QaRagisterPage reg=new QaRagisterPage(driver);
	  reg.firstname(null);
	  reg.lastname(null);
	  reg.email(null);
	  reg.telephone(null);
	  reg.password(null);
	  reg.confirmpass(null);
	  reg.checkbox();
	  reg.confirmbtn();
	  
	  QaAccSuccesPage myacc1=new QaAccSuccesPage(driver);
	  myacc1.clickcontinuebtn();
	  
	  QaMyacc2page myacc2= new QaMyacc2page(driver);
	  myacc2.clicknewsletterlink();
	  
	  QaNewslaterPage nlp=new QaNewslaterPage(driver);
	          boolean yesoptionselct = nlp.clickyesoptioncheckbox();
	          
	          Assert.assertTrue(yesoptionselct);
	  
	  
  }
}
