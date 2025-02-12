package com.inetbanking.testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.reactivex.rxjava3.functions.Action;

public class Mouseactions1 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://toolsqa.com/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement seleniumtre = driver.findElement(By.xpath("//div[@class='col-auto']/child::ul/descendant::a[text()='Selenium Training']"));
//		
//		Actions act= new Actions(driver);
//		act.moveToElement(seleniumtre);
//			
			 //explicit wait
//		WebDriverWait wait= new WebDriverWait(driver,4);
//	WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='col-auto']/child::ul/descendant::a[text()='Selenium Training']")));
//		//WebElement seleniumtre = driver.findElement(By.xpath("//div[@class='col-auto']/child::ul/descendant::a[text()='Selenium Training']"));
//		ele.click();
		
		
		
//		 Actions act= new Actions(driver);
//		 act.moveToElement(null)
		
		
		//use explicit wait
		
//		WebDriverWait wait= new web+
//		WebDriverWait wait= new WebDriverWait(driver, 3);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(by))
		
		 	}

}
