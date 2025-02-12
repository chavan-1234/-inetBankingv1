package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindows1 {
            public static void main(String[] args) throws InterruptedException {
				
            	WebDriver driver=new ChromeDriver();
            	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
			
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
             
                               String handle = driver.getWindowHandle();
                   WebElement mainwindow = driver.findElement(By.xpath(" //button[@id='newWindowBtn']"));
                    
                   JavascriptExecutor js=(JavascriptExecutor)driver;
                   js.executeScript("arguments[0].click()", mainwindow);
                   
                   
                       Set<String> handles= driver.getWindowHandles();
                       
                       for(   String windows :handles) {
                    	   
                    	   if( !windows.equals(handle)) {
                    		   
                    		   driver.switchTo().window(windows);
                    		   
                    		   js.executeScript("window.scrollBy(0, 800)");
                    		   
                    		WebElement fn = driver.findElement(By.xpath("//input[@id='firstName']"));
                    		fn.sendKeys("window");
                    		
                    		Thread.sleep(6000);
                    		
                    		
                    	   }
                       }//for
                       driver.switchTo().window(handle);
                      String text = driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText();
                       
                   System.out.println(text + "first window");
                   
                   
                  
                  
             
            }
}
