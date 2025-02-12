package sdetpavan;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Enableextentionatruntime {
     public static void main(String[] args) {
		
    	 ChromeOptions options=new ChromeOptions();
    	 File file=new File("C:\\Users\\HP\\Desktop\\automation\\Selectorshub.crx");
    	 options.addExtensions(file);
    	 
    	
    	 
    	 
    	 
    	 
    	 WebDriver driver=new ChromeDriver(options);
    	 driver.get("https://omayo.blogspot.com/");
	}
}
