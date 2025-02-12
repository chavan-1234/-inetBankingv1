package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker2 {


	
	public static void main(String[] args) {
		
		String expectedYear="2027";
        String expectedMonth="June";
	    String expectedDay= "15";
		
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 
		while(true) {
		String actualyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String actualmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		 
		     if(actualyear.equals(expectedYear) && actualmonth.equals(expectedMonth)) {
		    	 
		    	 break;
		    	 
		     }
		     driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		}//while
		  
		  
		   
		  //date
	List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/child::thead/following-sibling::tbody"));
		
	   for( WebElement date :dates) {
		   if(date.getText().equals(expectedDay)) {
			   date.click();
			   break;
		   }
	   }
	   
		   
		   
	}
}
