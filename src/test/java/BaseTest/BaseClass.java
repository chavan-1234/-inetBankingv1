package BaseTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public  static WebDriver driver;
     public Properties pro;
	
     
	
	public WebDriver openbrowserandapplication(String br) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\src\\test\\resources\\Config.properties");
		 pro=new Properties();//read data from properties
		 pro.load(fis);
		
		
//		switch (br) {
//		case "chrome":driver= new ChromeDriver();break;
//		case "firefox": driver= new FirefoxDriver();break;
//		case "edge": driver= new EdgeDriver();break;
//		
//		default:System.out.println("invalid browser name");
//			
//
//		
//		  return ;
//			
//		}
		 if(br.equals("chrome")) {
			driver=new ChromeDriver();
			
		 }
		 else if (br.equals("firefox")) {
			 driver=new FirefoxDriver();
			 
			
		}
		 
		
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
	}
	
	
	
//	@AfterClass
//	public void teardown() {
//		driver.close();  
//	}
	
	//for screenshot
	    public String captureScreen(String tname) {
	      String timestamp = new SimpleDateFormat("yymmddhhmmss").format(new Date());
	               
	      TakesScreenshot takescreenshot = (TakesScreenshot)driver;
	           File sourcefile = takescreenshot.getScreenshotAs(OutputType.FILE);
	            String targetfilepath = System.getProperty("user.dir")+ "Screenshots" +tname+ "-" + timestamp + ".png";
	            
	            File targetfile=new File( targetfilepath);
	            
	            sourcefile.renameTo(targetfile);
	            
	            
	            return  targetfilepath;
	            
	                            
	    	   
	    }
	    
		public WebDriver navigateback(WebDriver driver) {
			
			driver.navigate().back();
			return driver;
			
		}
		
		public String gethtmlpagecode() {
		      return	driver.getPageSource();
		}
}
