package com.inetbanking.testCases;

import java.util.Scanner;

public class Throw1 { 
	
	  public static void main(String[] args)
	  {
	try {	
	   int a=10;
		int j=0;
		int i= a/j;
		System.out.println(i);
		
		  
	}
	
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	
	  
	  }
}
