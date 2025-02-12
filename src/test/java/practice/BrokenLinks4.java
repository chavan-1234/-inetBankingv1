package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks4 {
	
	  public static void main(String[] args) throws IOException {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://tutorialsninja.com/demo/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			//broken links
			
			  List<WebElement> links = driver.findElements(By.tagName("a"));   // find all link
			  
			          System.out.println(links.size());
			          
			           for (    WebElement link: links) {
			        	   
			        	      String hrefvalue = link.getAttribute("href");// get href value in string format
			        	      
			        	      if( hrefvalue==null ||  hrefvalue.isEmpty()) {
			        	    	  System.out.println("href value is null ");
			        	    	  
			        	    	  continue; // skip this currunt value
			        	    	  
			        	      }
			        	      
			               //hit to the server
			        	      
			        	      try {
								URL linkurl=new URL(hrefvalue);
								
								    HttpURLConnection conn =(HttpURLConnection) linkurl.openConnection();
								
								   if (conn.getResponseCode()>=400) {
									   System.out.println( hrefvalue + " " + "url is broken");
								   }
								   else {
									   System.out.println(hrefvalue + " " + "not a broken link");
								   }
								
								
							} catch (MalformedURLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							
							}
			        	      
			        	      
			        	      
			        	      
			           }  //for loop
			  
			  
			  
		
	
	  
	  
	  
	  }
	
	

}
