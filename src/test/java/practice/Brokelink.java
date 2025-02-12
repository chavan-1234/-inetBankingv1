package practice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokelink {
	public static void main(String[] args) {
		
	
	 WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		              
		           List<WebElement> links = driver.findElements(By.tagName("a"));
		           
		            for(   WebElement link :links) {
		            	
		               String hrefvalue = link.getAttribute("href");
		               
		               if(hrefvalue!=null && hrefvalue.isEmpty()) {
		            	   
		            	   System.out.println("link is empty");
		               }
		               try {
		                URL url=new URL(hrefvalue);
		                
		                HttpURLConnection huc=(HttpURLConnection) url.openConnection();
		                            huc.setConnectTimeout(2000)
		                            huc.connect();
		                            
		                          
		                         int httpresponse = huc.getResponseCode();
		                         
		                         if(httpresponse>=400) {
		                        	 System.out.println(hrefvalue +" invalid");
		                         }
		                         else {
		                        	 System.out.println(hrefvalue + "valid");
		                         }
		                            
		                            
		               } 
		                catch (Exception e) {
							System.out.println(e);
						}
		               
		               
		            	
		            }
		           
		           
		         
		
		
		
		
		
		
		
		
}
}