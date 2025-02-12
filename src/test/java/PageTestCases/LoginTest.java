package PageTestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage1;

public class LoginTest {
        
	 WebDriver driver;
	 
	 @BeforeMethod
	 
	 void setup() {
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }
	 
	 
	       //original test method
	 
	 
	 
	  @Test
	  void login_Test() {
		  LoginPage1 lp= new LoginPage1(driver);
		  
		  lp.setusername("Admin");
		  lp.setpassword("admin12");
		  lp.setloginbtn();
		  
		 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		  
		  
	  }
	  
//	  @AfterMethod
//	  void teardown() {
//		  driver.close();
//	  }
	
}
