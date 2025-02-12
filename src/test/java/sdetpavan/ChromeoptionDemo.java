package sdetpavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeoptionDemo {
public static void main(String[] args) {
	
	  ChromeOptions options = new ChromeOptions();
	  
	 options.addArguments("--headless=new");
	 
	WebDriver driver= new ChromeDriver(options);  // it applicable for this browser after passing instance variable options
	
	driver.get(null);
	
	
}
}
