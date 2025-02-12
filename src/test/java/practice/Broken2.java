package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken2 {
  public static void main(String[] args) throws IOException {
	       ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://omayo.blogspot.com/");
		 
		 //find all links
		 
		             List<WebElement> links = driver.findElements(By.tagName("a"));
		             
		             for(    WebElement link  :links) {
		            	 //we get single link using this for each loop
		            	 
		            	         String hrefvalue = link.getAttribute("href");
		            	         
		            	         if(hrefvalue==null || hrefvalue.isEmpty()) {
		            	        	 
		            	        	 System.out.println("link is empty");
		            	        	 continue;
		            	        	 
		            	      
		            	        	 
		            	        	 
		            	         
		            	        	 
		            	         } //for loop
		            	         try {
		            	        	 
		            	         
		            	         URL url=new URL(hrefvalue); //convert into http format to hit to server
		            	         
		            	    HttpURLConnection huc = (HttpURLConnection)url.openConnection();
		            	    
		            	    if(huc.getResponseCode()>400) {
		            	    	System.out.println(hrefvalue + "link is broken");
		            	    }
		            	    else {
		            	    	System.out.println(  hrefvalue +"link is not  broken");
		            	    }
		            	    	
		            	         
		            	 
		             }
		             catch(Exception e) {
		            	 System.out.println(e);
		             }
		            	 
  } // for loop
}
}
