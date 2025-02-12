package practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prac1 {
  @Test
      //test case test the height and width of each field and also test how many charc are accept the field
      public void testRegpagefeatureheightandwidth() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	    
	  String expectedheight="34px";
	  String expectedwidth="100";
	  

	     WebElement firstname = driver.findElement(By.xpath("//input [@id='input-firstname']"));
	     String fexh = firstname.getCssValue("height");
	     String fexw = firstname.getCssValue("width");
	     
	   Assert.assertEquals(fexh ,expectedheight) ;
	   Assert.assertEquals(fexw ,expectedwidth) ;
	     
	   
	   //verify firstname accept blank or white space 
	   firstname.sendKeys("") ;
	   //need click on continue
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	 String  expectedwarningmsg="First Name must be between 1 and 32 characters!";
	 
	
	String factualmsg = driver.findElement(By.xpath("//input[@id='input-firstname']/following-sibling::div")).getText();
	 
	   	Assert.assertEquals(expectedwarningmsg,factualmsg);
	   	
	  
	  
  }
}