package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
         public static void main(String[] args) {
        	 WebDriver driver=new ChromeDriver();
 			driver.manage().window().maximize();
 			driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
 			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 			
 			
 WebElement dropdown = driver.findElement(By.xpath("//div[@class='information closable']/following-sibling::p/child::select"));
 			
            Select sel=new Select(dropdown);
            sel.selectByVisibleText("Algeria"); 
            
            
                          List<WebElement> alloptions = sel.getOptions();
                          
                          System.out.println(alloptions .size());
                          
                          //printing all countries
                          
                          for(   WebElement option   : alloptions) {
                        	  
                        	System.out.println( option.getText()); 
                        	  
                          }
            
            
            
            
 
 
 
		}
}
