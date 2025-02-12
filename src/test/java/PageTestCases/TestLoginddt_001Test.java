package PageTestCases;

import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Homepage2;
import com.inetbanking.pageObjects.LoginddtPage1;
import com.inetbanking.pageObjects.Myaccountpage;

import BaseTest.BaseClass;

public class TestLoginddt_001Test extends BaseClass  {
	//use here dataprovider
  @Test(dataProvider = )
  public void loginddttest() {
	  
	  Homepage2 hp=new Homepage2 (driver);
	  hp.clickmyacc();
	  hp.clickloginbtn();
	  
	  LoginddtPage1  log=new LoginddtPage1 (driver);
	  log.setemail(null);
	  log.setpassword(null);
	  log.clicklgn();
	  
	  Myaccountpage map=new Myaccountpage(driver);
	    boolean pageexist = map.isMyAccpageexist();
	  
	  
	  
  }
}
qqq