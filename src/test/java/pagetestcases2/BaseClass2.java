package pagetestcases2;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass2 {
  
 public static	WebDriver driver;
  public static	Properties pro;
	
     
	
  public void openbrowserandapplication(String br) throws IOException {
		
	//	String browser="chrome";  
		
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if (br.equals("firefox")) {
			driver=new ChromeDriver();
		}
		else if (br.equals("io")) {
			driver=new InternetExplorerDriver();
			
		}
		
		
		
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\src\\test\\resources\\Config.properties");
		pro.load(fis);
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		
  }//setup
	
	@AfterClass
	
	public void teardown() {
		driver.quit();
		
	}
	
	public WebDriver navigateback(WebDriver driver) {
		
		driver.navigate().back();
		return driver;
		
	}
	
	
	
	
}
