package com.inetbanking.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {
	
	
	public static void main(String[] args) {
		WebDriver driver;
	
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//       WebElement checkalert = driver.findElement(By.xpath("//div[@class='card -body']/child::h5[text()='Alerts, Frame & Windows']"));
//       checkalert.click();
       
       
                      List<WebElement> links = driver.findElements(By.tagName("a"));
	                              int alllinks = links.size();
	                              System.out.println(alllinks);
}
	

}
