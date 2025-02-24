package com.inetbanking.utilities;

import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenlinkChecker {
       
	
	public static void verifylink() {
		
		URL url=new URL(null)
		HttpURLConnection conn=(HttpURLConnection)url.openConnection();
		
		conn.connect();
		        int responsecode = conn.getResponseCode();
		        
		        if(responsecode>=400) {
		        	System.out.println("");
		        }
		             
		
	}
}
