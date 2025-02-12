package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {
public static void main(String[] args) throws IOException {
	

	 WebDriver driver= new ChromeDriver();
	 driver.get("http://omayo.blogspot.com/");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //full page
//	 
//	               TakesScreenshot ts = (TakesScreenshot)driver;
//	                     File source = ts.getScreenshotAs(OutputType.FILE);
//	                     File target= new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\Screenshots\\ajay.png");
//	                      FileUtils.copyFile(source, target);
	 
	 
	   //specific element
	              WebElement logo = driver.findElement(By.xpath("//h1[contains(text(), 'omayo')]"));
	                    File source = logo.getScreenshotAs(OutputType.FILE);
	                    File target=new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\Screenshots\\omayo1.png");
	                //.copyFile(source, target);
	                    source.renameTo(target);
	                    
	                    
}
}
