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

public class Broken5 {
           public static void main(String[] args) throws IOException {
			
        	   //broken links 
        	   
        	   WebDriver driver=new ChromeDriver();
        	   driver.get(null);
        	   driver.manage().window().maximize();
        	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        	   
        	  List<WebElement> links = driver.findElements(By.tagName("a"));
        	     int size = links.size();
        	     
        	     for(  WebElement link :links) {
        	    	 
        	    	 
        	    	  String hrefvalue = link.getAttribute("href");//link store in href tag
        	    	  
        	    	  if(hrefvalue==null || hrefvalue.isEmpty() ) {
        	    		  
        	    		  System.out.println("hrefvalue is empty");
        	    		  continue; //skip currunt currunt iteration0
        	    	  }
        	    	  
        	    	  
        	    	  try {
        	    		  
        	    	        URL url=new URL(hrefvalue);
        	    	          
        	     HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        	     
        	        if(huc.getResponseCode()>=400) {
        	        	
        	        	System.out.println(hrefvalue+ " : link is broken");
        	        }
        	        else {
        	        	System.out.println(hrefvalue = " Link is not broken");
        	        }
        	     
        	    	  }
        	    	  catch (Exception e) {
						System.out.println(e);
					}
        	    	  
        	    	  
        	    	 
        	     }
        	   
		}
}
