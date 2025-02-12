package listenerprac;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestListener {
  
	
	WebDriver driver;
	@BeforeClass
  public void setup() {
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  
  }
	
	
	@Test(priority = 1)
	
	void logotest() {
	     boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	 
	     System.out.println(logo);
	     Assert.assertEquals(logo, false);
	     
	}
	
	
	@Test(priority = 2)
	void appurltest() {
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/");
	}
		
	 @Test(priority = 3 , dependsOnMethods = {"appurltest"})
	 void homepagetitletest() {
		 
		 Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		 
	 }
	 
	 @AfterClass
	 
	 void teardown() {
		 driver.close();
	 }
	
	
}
