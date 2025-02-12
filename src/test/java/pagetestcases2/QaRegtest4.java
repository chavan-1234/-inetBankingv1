package pagetestcases2;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaRegpage4;

public class QaRegtest4  extends BaseClass2 {
  @Test
  public void checkregfieldleftblank() {
	    
	  QaRegpage4 reg4=new QaRegpage4 (driver);
	  reg4.myacc();
	  reg4.register();
	  reg4.firstname(null);
	  reg4.lastname(null);
	  reg4.email(null);
	  reg4.telephone(null);
	  reg4.password(null);
	  reg4.confirmpass(null);
	  reg4.checkbox();
	  reg4.confirmbtn();
	  String expecfi = reg4.ferror();
	  String expeclast = reg4.lerror();
	  String expecemail = reg4.emailerror();
	  String expectele = reg4.teleerror();
	  String expecpass = reg4.pwderror();
	  String expecprivacy = reg4.privacyerror();
	  
	  String actualfirstnamewarningmsg = "First Name must be between 1 and 32 characters!";
	  String actuallastnamewarningmsg = "Last Name must be between 1 and 32 characters!";
      String actualemailwarningmsg = "E-Mail Address does not appear to be valid!";
      String actualtelewarningmsg = "Telephone must be between 3 and 32 characters!";
      String actualpwdwarningmsg = "Password must be between 4 and 20 characters!";
      String actualprivacywarningmsg = "Warning: You must agree to the Privacy Policy!";
      
      Assert.assertEquals(expecfi, actualfirstnamewarningmsg);
      Assert.assertEquals(expeclast,actuallastnamewarningmsg);
      Assert.assertEquals(expecemail,actualemailwarningmsg);
      Assert.assertEquals(expectele, actualtelewarningmsg);
      Assert.assertEquals(expecpass, actualpwdwarningmsg);
      Assert.assertEquals(expecprivacy, actualprivacywarningmsg);
  }
}
