package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prac3 {
  @Test
  public void testRfemailfield() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.findElement(By.xpath("//span[text()='My Account']")).click();
	  driver.findElement(By.xpath("//a[text()='Register']")).click();
	              driver.findElement(By.xpath("//input [@id='input-firstname']")).sendKeys("ajay")
	               driver.findElement(By.xpath("//input [@id='input-lastname']")).sendKeys("rane")
	                        driver.findElement(By.xpath("//input [@id='input-email']"))
	                        driver.findElement(By.xpath("//input [@id='input-telephone']")).sendKeys("7845963245");
	                        
	                        driver.findElement(By.xpath("//input [@id='input-password']")).sendKeys("12345");
	                        driver.findElement(By.xpath("//input [@id='input-confirm']")).sendKeys("12345");
  
	                        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	                        driver.findElement(By.xpath("//input[@type='submit']")).click();   
	                     
  }
}
