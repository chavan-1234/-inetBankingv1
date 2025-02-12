package practice;

import java.util.Date;

import org.testng.annotations.Test;

public class Utilitygamil {
     
	@Test
  public static String createrandomgamilid() {
	  
          return new Date().toString().replaceAll("\\s","").replaceAll("\\:", "")+ "@gmail.com";
	  
	   
  }
}
