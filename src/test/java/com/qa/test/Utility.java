package com.qa.test;


	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class Utility { 
	    
		    //instance variable
		
		       public static FileInputStream fi;
		       public static FileOutputStream fo;
	           public static XSSFWorkbook wb;
		       public static XSSFSheet   ws;
		       public static XSSFRow row;
		       public static XSSFCell cell;
		       
		       public  static int getrowcount(String xlfile, String xlsheet) throws IOException {
		    	   
		    	    fi=new FileInputStream(xlfile);
		    	    wb=new XSSFWorkbook(fi);
		           	ws  =wb.getSheet(xlsheet); 
		             int rowcount = ws.getLastRowNum();
		             wb.close();
		             fi.close();
		             return rowcount;
		             
		    	 }
		       
		       public static int  getcellcount(String xlfile, String xlsheet , int rownum ) throws IOException {
		    	   fi=new FileInputStream(xlfile);
		    	    wb=new XSSFWorkbook(fi);
		    	    ws = wb.getSheet(xlsheet);
		    	        row = ws.getRow(rownum);
		    	        
		    	      int cellcount = row.getLastCellNum();
		    	        wb.close();    
		    	        fi.close();
		    	      return cellcount;
		    	   
		    	   
	             }   
		       
		       public static String getcelldata(String xlfile, String xlsheet, int rownum, int column ) throws IOException {
		    	   fi=new FileInputStream(xlfile);
		    	    wb=new XSSFWorkbook(fi);
		    	    ws = wb.getSheet(xlsheet);
		    	         row   = ws.getRow(0);
		    	          cell  = row.getCell(column);
						
		    	          String data;
		    	          try {
		    	        	data   =cell.toString();
		    	        	
		    	          }
		    	     catch (Exception e) {
						data="";
						
					}
		    	          wb.close();    
			    	        fi.close();
			    	      return data;
		    	    
		    	   
		    	   
		    	   
		    	   
		       }
		
		
	}


