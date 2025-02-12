package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNoOfFrames {
      public static void main(String[] args) {
		
    	  WebDriver driver=new ChromeDriver();
    	  
    	  driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
    	  
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	  
//    	     List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
//    	     
//    	System.out.println(iframes.size());
    	  
    	       List<WebElement> noofframes = driver.findElements(By.tagName("iframe"));
    	    System.out.println( noofframes.size());//we get total frame
    	  
	}
}
