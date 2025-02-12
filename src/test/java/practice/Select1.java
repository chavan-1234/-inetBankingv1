package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
   
public class Select1 {
	
	               //Use getOptions() method to get option from dropdown list
               public static void main(String[] args) {
            	   WebDriver driver= new ChromeDriver();
        	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	       driver.get("https://omayo.blogspot.com/");
        	       driver.manage().window().maximize();
        	       
        	       //dropdown field
        	         WebElement dd = driver.findElement(By.xpath("//select[@id='drop1']"));
        	       
        	         Select sel = new Select(dd);
        	         
        	                List<WebElement> dropdownoptions = sel.getOptions();
        	                for(int i=0; i<dropdownoptions.size(); i++) {
        	                	System.out.println(dropdownoptions.get(i).getText());
        	                	
        	                }
        	       
			}
}
