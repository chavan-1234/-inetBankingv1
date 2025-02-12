package TestNgTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPrac {
	
	
  @Test(dataProvider = "datalogin" )
  public void logintest(String un , String pwd) {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	  
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
	  driver.findElement(By.xpath("//button[@id='submit']")).click();
	  
	String errrrmsg = driver.findElement(By.xpath("//div[@id='error']")).getText();
	  
	  Assert.assertEquals(errrrmsg, "Your username is inval!");
	  
  }
  
                 
     @DataProvider (name= "datalogin")
     public Object[][] logindata() {
    	 
    	 Object[] [] data = {{"jknkkj" ,"3565"}, {"jhgjhg" ,"546546"}  };
    	 
    	 return data;
    	 
    	 
     }
     
     
  
  
  
  
  
  
  
}//class
