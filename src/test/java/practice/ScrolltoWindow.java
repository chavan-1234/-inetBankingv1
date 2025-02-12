package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.reactivex.rxjava3.functions.Action;

public class ScrolltoWindow {
      public static void main(String[] args) {
		
    	  WebDriver driver=new   ChromeDriver();
    	  driver.get("https://mytestingthoughts.com/Sample/home.htm");
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  
    	     WebElement gender = driver.findElement(By.xpath("//input[@id='inlineRadioMale']"));
    	     
    	    Actions act=new Actions(driver);
    	    
    	    act.scrollToElement(gender).perform();
    	    
    	    gender.click();
    	    
    	  
    	  
      }
       
}
