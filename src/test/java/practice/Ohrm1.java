package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ohrm1 {
	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[text()=' Login ']")).click();
			
		 driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		 
		  WebElement firstbox = driver.findElement(By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div/child::div/child::div/child::div[@class='oxd-select-text-input']"));
		  firstbox.click();

   List<WebElement> options = driver.findElements(By.xpath(" //div[@role='option']")) ;
		  
		   //System.out.println(options.size());
            for(    WebElement op :options) {
            	
            	         String text = op.getText();
            	         
            	         System.out.println(text);
            }
		  
		  
	}

}
