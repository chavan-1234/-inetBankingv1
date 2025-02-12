package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class Qaregtestprovidespacesallfield16 extends BaseClass2  {
  @Test
  public void provideOnlySpaces() {
	  
	  QaHomepage hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  
	  //do not provide any data to page class .provide spaces for each field
	  QaRagisterPage  reg= new QaRagisterPage(driver);
	  reg.firstname(null);
	  reg.lastname(null);
	  reg.email(null);
	  reg.telephone(null);
	  reg.password(null);
	  reg.confirmpass(null);
	  reg.checkbox();
	  reg.confirmbtn();
	  
	String   feactual   = reg.getFirstnameerror();
	String    seactual  = reg.getLastnameerror();
	String    eeactual     = reg.getEmailerror();
	String  teactual   =reg.getteleerror();
	String  peactual= reg.getpassworderror();
	  
	  Assert.assertEquals(feactual ,"First Name must be between 1 and 32 characters! ");
	  Assert.assertEquals(seactual,"Last Name must be between 1 and 32 characters!" );
	  Assert.assertEquals( eeactual ,"E-Mail Address does not appear to be valid!" );
	  Assert.assertEquals(teactual, "Telephone must be between 3 and 32 characters!");
	  Assert.assertEquals(peactual, "Password must be between 4 and 20 characters!");
	  
}
}
