package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Prac4 {
  @Test
  public void verifyrfcheckbox() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	      WebElement cb = driver.findElement(By.xpath("//input[@type='checkbox']"));
	               boolean cb1 = cb.isSelected();
	               Assert.assertFalse(cb1);
	               
	      
	   
	    
  }
}
