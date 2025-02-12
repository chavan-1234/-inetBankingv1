package pagetestcases2;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaRagisterPage;

public class QaRegPwdComplexity17 extends BaseClass2 {
  @Test(dataProvider ="datapwd" )
  public void verityPwdComplexity(String datapwd) {
	  
	  QaHomepage hp=new QaHomepage(driver);
	  hp.clickmyacc();
	  hp.clickregister();
	  
	  //registration page
	  QaRagisterPage rp=new QaRagisterPage(driver);
	  rp.firstname("ajay");
	  rp.lastname("chavan");
	  rp.email("ajay123@gmail.com");
	  rp.telephone("6523124578");
	  rp.password(datapwd);
	  rp.confirmpass(datapwd);
	  rp.checkbox();
	  rp.continuebtn();
	  
	  String Expectedwarmsg="pwd does not follow complexity standard";
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-password']/following-sibling::div")),  Expectedwarmsg);
	  
	  
	    //dataprovider
	 
  }
  
  
  @DataProvider(name="datapwd")
  
  public Object[][] supplypwd(){
	  
	      Object[][] data = {{"12345"},{"abcde"}, {"Abgfh152"}, {"asdfg4562"} , {"Jjhhjh12#"}};
	      return data;
	      
  }
}
