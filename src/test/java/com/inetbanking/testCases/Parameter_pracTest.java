package com.inetbanking.testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_pracTest {
         @Test
         @Parameters({"i" ,"j" })
           public void add(int a , int b) {
	         System.out.println( "add : " + a+b);
             }
  
  
         @Test
         @Parameters({"i" , "j"})
            public void sub(int a , int b) {
        	 
            System.out.println( "div :" +  a/b);
      }
  
         
            @Test
            @Parameters({"i" , "j"  })
              public void multi(int a , int b) {
                 System.out.println( "multi :" +a*b);
      }
  
  
  
}
