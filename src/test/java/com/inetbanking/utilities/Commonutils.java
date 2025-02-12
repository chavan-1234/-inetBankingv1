package com.inetbanking.utilities;

import java.util.Date;
import java.util.Random;

public class Commonutils {
	
	
	public  static  String generatedbrandnewEmail() {
	         return  new Date().toString().replaceAll("\\s","").replaceAll("\\:", "")+ "@gmail.com";
	         
		
	}
	
	    public static String validemailrandamizegenerator() {
	    	
	    	String [] validemail= {"ajay4321@gmail.com" , "ajay4321@gmail.com", "ajay4321@gmail.com" ,"ajay4321@gmail.com"};
	    	
	    	Random random=new Random();
	    	     int index = random.nextInt();
	    	     
	    	     return validemail[index];
	    	     
	    }
	
}
