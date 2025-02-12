package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaMyacc2page;
import com.inetbanking.pageObjects.QaAccSuccesPage;
import com.inetbanking.pageObjects.QaEditInfopage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class QaregfunLeadingandTrailingSpacesVerify extends BaseClass2 {
  @Test
  public void verifyleadingandTrailingspaces() {
	  
	  QaHomepage hp=new QaHomepage(driver);
	  
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  QaRagisterPage rp=new QaRagisterPage(driver);
	  String fn="       " + pro.getProperty("firstname") + "     ";
	  rp.firstname(fn);
	  String ln="       " + pro.getProperty("lastname") + "     ";
	  rp.lastname(ln);
	  String email="       " + pro.getProperty("email") + "     ";
	  rp.email(email);
	  String tele="       " + pro.getProperty("telephone") + "     ";
	  rp.telephone(tele);
	  
	  rp.password(pro.getProperty("pass"));
	  rp.confirmpass("pass");
	  rp.checkbox();
	  rp.continuebtn();
	  
	  QaAccSuccesPage my1=new QaAccSuccesPage(driver);
	 
	  my1.clickcontinuebtn();
	  QaMyacc2page page2=new  QaMyacc2page(driver);
	  page2.clickeditinfo();
	  
	  QaEditInfopage editinfo=new QaEditInfopage(driver);
	Assert.assertEquals(editinfo.getfirstname(), fn.trim());
	Assert.assertEquals(editinfo.getlastname(), ln.trim());
	Assert.assertEquals(editinfo.getemail(), email.trim());  
	Assert.assertEquals(editinfo.gettelephone(), tele.trim());  
  }
}
