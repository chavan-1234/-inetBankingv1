package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6 {
     public static void main(String[] args) throws IOException {
		
    	 ChromeDriver driver=new ChromeDriver();
    	 
    	 driver.get("https://www.orangehrm.com/");
    	 
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 
    	 int count=0;
    	 
    	    List<WebElement> links = driver.findElements(By.tagName("a"));
    	    
    	   System.out.println("no of links in page  " + links.size());
    	   
    	   //broken links
    	   
    	   for(   WebElement link :links ) {
    		   
    		   
    		      String hrefvalue = link.getAttribute("href");
    		      
    		      if(hrefvalue==null || hrefvalue.isEmpty()) {
    		    	  
    		    	  System.out.println( hrefvalue + " " + "href value is null");
    		    	  
    		    	  count++;
    		    	  
    		    	 continue;
    		    	 
    		      }//if condition
    		         try {
    		             URL url=new URL(hrefvalue);//convert href value into http format for hit to server
    		             
    		             HttpURLConnection huc = (HttpURLConnection) url.openConnection();
    		             
    		             if(huc.getResponseCode()>=400) {
    		            	 
    		            	 System.out.println(hrefvalue+ "  " + "link is a broken");
    		             }
    		             
    		             else {
							System.out.println(hrefvalue + " " +" link is  not a broken");
						}
    		      
    		      
    		      
    		         } 
    		         catch (Exception e) {
				       System.out.println(e);
					}
    		      
    		      
    		   
    	   }//for
    	  System.out.println("total null links " + count);
    	 
	}//main
}
