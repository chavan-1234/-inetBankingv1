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

public class Bl5 {

	public static void main(String[] args) throws IOException {
		 WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			            List<WebElement> links = driver.findElements(By.tagName("a"));
			                   System.out.println(links.size());
			                   
			          for(  WebElement link  :links) {
			        	  
			        	      String hrefvalue = link.getAttribute("href");    //get a attribute value
			        	      
			        	      if(hrefvalue==null || hrefvalue.isEmpty()) {
			        	    	  
			        	    	  System.out.println("hrefvalue is empty");
			        	    	  continue;
			        	    	  
			        	      }
			        	      
			        	      
			        	      //hit to server
			        	        try {
			        	        URL linkurl = new URL(hrefvalue);
			        	        
			        	          HttpURLConnection conn = (HttpURLConnection)linkurl.openConnection();
			        	          
			        	          if(conn.getResponseCode()>=400) {
			        	        	  System.out.println(hrefvalue + " link is broken");
			        	          }
			        	          else {
			        	        	  System.out.println(hrefvalue + "not a broken link");
			        	          }
			        	        }
			        	        catch (Exception e) {
									System.out.println(e);
								}
			        	        
			        	          
			          }  // for loop
			            
			            
			            
			 
			
	}
}
