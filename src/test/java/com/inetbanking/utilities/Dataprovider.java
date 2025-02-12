package com.inetbanking.utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	
	@DataProvider
	public String[][] getdata() throws IOException{
		
		
		String path="C:\\Users\\HP\\Desktop\\exceldata\\book4.xlsx";
		Excelutility  xlutil =new Excelutility(path);
		
		 int totalrows = xlutil.getrowcount("sheet1");
		   int totalcols = xlutil.getcellcount("sheet1", 1);
		      
		      String [][]logindata=new String[totalrows][totalcols];
		      
		      for(int i=1; i<=totalrows; i++) { //not include header part 
		    	  
		    	  for(int j=0; j<=totalcols; j++) {
		    		  
		    		     logindata [i-1][j] =  xlutil.getcelldata("sheet1", i, j);
		    		  
		    	  }
		      }
		 return logindata;
		
		
	}
	

}
