package ParameterAndParallel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest1Test {
  
	WebDriver driver;
	@Parameters({"browser"})
	@BeforeClass
        public void setup(String br) throws InterruptedException {
		
		switch (br) {
		case "chrome":  driver=new ChromeDriver(); break;
		case  "firefox":   driver=new FirefoxDriver();break;
		case "edge" : driver=new EdgeDriver();break;
		
			

		default:System.out.println("invalid broeser"); return;
		
			
		}//switch 
		
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
       }
	 
	
	  @Test
	  
	  void logotest() throws InterruptedException {
		  
		     boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		  
		     Assert.assertEquals(logo, true);
	  }
	  @Test
	  void titletest() {
		  Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	  }
	
	  @Test
	  void urltset(){
		  Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  }
	  
	  void teardown() {
		  driver.close();
	  }
	
}
