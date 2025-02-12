package PageTestCases;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPageWithJs;

public class LoginTestJs {

	     WebDriver driver;
	     
	     @BeforeMethod
	     public void setup() {
	    	   driver=new ChromeDriver();
	    	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    	   driver.manage().window().maximize();
	    	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
	     }
	     
	     @Test
	     
	     public void logintest1() throws InterruptedException {
	    	 LoginPageWithJs lp=new LoginPageWithJs(driver);
	    	 lp.setusername(" Admin");
	    	 lp.setpassword("admin123");
	    	 lp.clickloginbtn();
	    	 
	     }
	     
	     @AfterMethod
	     public void teardown() {
	    	 driver.close();
	     }
	 
	
	
	
	
	
	
	
	
	
}
