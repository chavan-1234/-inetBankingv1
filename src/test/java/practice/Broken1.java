package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken1 {
    public static void main(String[] args) throws IOException {
		
    	
    	WebDriver driver=new ChromeDriver();
      	driver.get(null);
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	
                      List<WebElement> links = driver.findElements(By.tagName("a"));
                      //list allow dup ,
                      
                     int size = links.size(); // to get how many links in a app
                     
                     for(  WebElement link :links) {
                    	   String hrefvalue = link.getAttribute("href");
                    	   
                    	   
                    	   if(hrefvalue==null || hrefvalue.isEmpty()) {
                    		   
                    		   System.out.println("link is not available");
                    		   continue;
                    		   
                    	   }
                    	   
                    	   URL url=new URL(hrefvalue);
                    	   
                    	   try {
                    		   HttpURLConnection huc = ( HttpURLConnection ) url.openConnection();
                    		   
                    		   if(huc.getResponseCode()>=400) {
                    			   System.out.println(hrefvalue + " link is not broken");
                    		   }
                    		   else {
                    			   System.out.println(hrefvalue + " link is broken");
                    		   }
						} catch (Exception e) {
							// TODO: handle exception
						}
                    	        
                    	        
                    	        
                    	     
                    	 
                    	 
                     }//for loop
                      
               	
	}
} 

