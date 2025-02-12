package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {
   
	 // file - workbook -sheet- row-cell
	
	public static FileInputStream fi;
	public static 	XSSFWorkbook wb;
	public static  XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	
	public static int getrowcount(String file , String sheet1) throws IOException {
		
	       	fi=new FileInputStream(file);
		     wb=new XSSFWorkbook(fi);
		     ws = wb.getSheet(sheet1);
		     int rowcount = ws.getLastRowNum();
		     wb.close();
		     fi.close();
		     
		     return rowcount;
		     
		    }
	
	      public static int getcellcount( String file, String sheet1 , int rowno) throws IOException {
		   fi=new FileInputStream(file);
		   wb=new XSSFWorkbook(sheet1);
	        ws =wb.getSheet(sheet1);
	          row   = ws.getRow(rowno);
	       int cellcount    =row.getLastCellNum();
	          wb.close();
		     fi.close();
		   return cellcount;
		   
		   
	   }
	      
	       
	
	
	
	
	
}
