package TestNgTest;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handlewindow1 {
  @Test
  public void amazon() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//input[contains(@id, 'twota')]")).sendKeys("shoes");
	  
	  driver.findElement(By.xpath("//input[contains(@id, 'nav')]")).click();
	  
	  driver.findElement(By.xpath("//span[text()='EVA Lite Sport Shoes Running Shoes for Men- Black']")).click();
	  
	                             String pw = driver.getWindowHandle();
	                                    
	             Set<String> handles = driver.getWindowHandles();
	             
	             for(     String handle  : handles) {
	            	 
	            	    if(  !handle .equals(pw)) {
	            	    	driver.switchTo().window(handle);
                           driver.findElement(By.xpath("//input[contains(@id,'buy-n')]")).click();
                           
	            	    }
	             }
	             
	             driver.switchTo().window(pw);
	             driver.findElement(By.xpath("//input[contains(@id, 'twota')]")).clear();
	             driver.findElement(By.xpath("//input[contains(@id, 'twota')]")).sendKeys("ajay");
	             
	               
	  
  }
}
