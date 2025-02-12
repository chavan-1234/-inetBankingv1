package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_Frame {
	  public static void main(String[] args) {
		  // we can switch to the frame using "id", "name" attribute and using webelement (means find xpath)& index 
		WebDriver driver;
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.automationtesting.in/Frames.html");
			
			// switch to frame using its "name" attribute
			WebElement swbutton = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		//	 Actions act= new Actions(driver);
//			 
//			 act.moveToElement(swbutton).perform();
			
			
			 swbutton.click();	
			 
	         	WebElement windowbutton = driver.findElement(By.xpath("//a[text()='Windows']")) ;
	         	windowbutton.click();
	         WebElement seperatewindow = driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']"));
	         seperatewindow.click();
	         driver.findElement(By.xpath("//button[text()='click']")).click();
	         driver.findElement(By.xpath("//h4[text()='Selenium Grid']")).click();
	         
			 
	}
	
	

}
