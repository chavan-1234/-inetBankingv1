package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDemo {
 
	public static void main(String[] args) {
		
		    //local variable
		              String expectedmonth = "December";
		              String expectedyear = "2025";
		              String expecteddate = "2";
		              
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
			driver.switchTo().frame(0);
			
		       WebElement datepicker = driver.findElement(By.xpath("//input[@id='datepicker']"));
		       datepicker.click();
		       
		    while (true) {
		    	
		     WebElement calendarmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		      String month = calendarmonth.getText();
		    WebElement calendaryear = driver.findElement(By.xpath(" //span [@class='ui-datepicker-year']"));
		          String year = calendaryear.getText();
		    if( month.equals(expectedmonth)  && year.equals(expectedyear) ) {
		    	
		      List<WebElement> dayslist = driver.findElements(By.xpath("//table/child::tbody/child::tr/child::td"));
		    	 
		                       	for(    WebElement d: dayslist) {
		                       		 String calendarday = d.getText();
		                       		if( calendarday.equals(expecteddate) ) {
		                       			d.click();
		                       			break;
		                       			
		                       		}
		                       		
		                       	}
		                      break; 	
		              }//first if
		    else {
		    	WebElement nextbut = driver.findElement(By.xpath("//span[text()='Next']"));
		    	nextbut.click();
		    	
		    }
		    	   
		    }
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
		       
	}
}
		  