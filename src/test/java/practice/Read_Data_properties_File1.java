package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Data_properties_File1 {
         public static void main(String[] args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		        
			File file=new File("C:\\Users\\HP\\eclipse-workspace\\inetBankingv1\\MyData\\data.properties");
			FileInputStream fis= new FileInputStream(file);
			Properties pro= new Properties();
			pro.load(fis);
			
		            	driver.get(pro.getProperty("url"));
		            	
			           WebElement un = driver.findElement(By.xpath("//input[@id='email']"));
			           un.sendKeys(pro.getProperty("username"));
			           
			          WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
			          pass.sendKeys(pro.getProperty("password"));
			          
			          
			          driver.findElement(By.xpath("//button[@name='login']")).click();
			          
			
			
			
			
			
		}
}
