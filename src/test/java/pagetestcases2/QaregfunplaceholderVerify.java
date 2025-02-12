package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;



public class QaregfunplaceholderVerify extends BaseClass2{
  @Test
  public void verifyplaceholder() {
	   
	  //home
	  QaHomepage hp=new QaHomepage(driver);
	  
			  hp.clickmyacc();
			  hp.clickregister();
			  
			  QaRagisterPage regpage=new QaRagisterPage(driver);
			String firstplace = regpage.getfirstnameph();
			String lastplace   = regpage.getlastnameph();
			String emailplace   =regpage.getemailph();
			String teleplace    = regpage.getteleph();
			String pwdplace   =regpage.getpassph();
			String conpwdplace   =  regpage.getconfpwdph();
			
		Assert.assertEquals(firstplace, "First Name");	
		Assert.assertEquals(lastplace , "Last Name");	
		Assert.assertEquals(emailplace, "E-Mail");	
		Assert.assertEquals(teleplace, "Telephone");	
		Assert.assertEquals(pwdplace, "Password");	
		Assert.assertEquals(conpwdplace , "Password Confirm");	
  }
}
