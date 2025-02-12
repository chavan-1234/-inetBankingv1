package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_links3 {
       public static void main(String[] args) {

   	     WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
   	     driver.get("https://tutorialsninja.com/demo/"); 
   	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	     
   	          // first find all links 
   	     
   	                      List<WebElement> links = driver.findElements(By.tagName("a"));
   	                  
   	                              for(  WebElement link :links) {
   	                            	  
   	                            	    String url = link.getAttribute("href");
   	                            	    
   	                            	    
   	                            	    if(url==null || url.isEmpty()) {
   	                            	    	System.out.println("url is empty");
   	                            	    	continue;
   	                            	    }
   	                            	    
   	                    try {
							HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
							
							if(huc.getResponseCode()>=400) {
								System.out.println(url + " url is broken");
							}
							else {
								System.out.println(url + "url is valid");
							}
							
							
							
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
   	                            	    
   	                            	    
   	                            	  
   	                            	  
   	                              }
   	                      
   	              
   	                      
   	     
	}
}
