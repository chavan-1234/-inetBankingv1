package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWindow {
	  public static void main(String[] args) {
		
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://utkarshaaacademy.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		      WebElement bookdemobutton = driver.findElement(By.xpath("//a[text()='Book Demo Online']"));
		      
		      // action class used for scroll page
		      Actions act= new Actions(driver);
		      
		      act.scrollToElement(bookdemobutton).perform();
		      bookdemobutton .click();
		      
		  
//		   JavascriptExecutor js=(JavascriptExecutor)driver;
//		   
//		   js.executeScript("window.scrollBy(0,500)");  // for scrollup
//		   
//		   //for scroll down 
//		   
//		   js.executeScript("window.scrollBy(0,-300)"); //use - minus for page scroll up
//		   
		   
	}

}
