package TestNgTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class C2 {
  @Test
         void xyz() {
	         System.out.println("this is xyz from c2 class");
          }
  
  
           @AfterTest
           void at() {
        	   System.out.println("this is after test method");
           }
}
