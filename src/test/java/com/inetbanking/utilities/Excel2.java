package com.inetbanking.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2 {

	static  FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static  XSSFRow row;
	static	  XSSFCell cell;
	  static String path;
	  
	  Excel2(String path){
		  this.path=path;
		  
	  }
	  
	public static int getrowcount(String sheet1) throws IOException {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet =wb.getSheet(sheet1);
	int	rowcount =sheet.getLastRowNum();
	  wb.close();
	  fis.close();
		
		return rowcount;
		
		
	}
	
    	public static int getcellcount(String sheet1 ,int rownum) throws Exception {
		fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
		sheet   =wb.getSheet(sheet1);
		  row  =sheet.getRow(rownum);
	   int	cellcount    =  row.getLastCellNum();
		  
	   wb.close();
		  fis.close();
			
			return cellcount;
		
		
	}
	
	
    	public static String getcelldata(String sheet1) throws IOException {
    		fis=new FileInputStream(path);
    		wb=new XSSFWorkbook(fis);
    	sheet =wb.getSheet(sheet1);
        row    =	sheet.getRow(0)	;
          cell     =  row.getCell(0);
         String data;
         try {
        	 data=cell.toString();
        	 
         }
         catch (Exception e) {
			data="";
			
		}
                 
       return data;
       
    	}
	
	
	
	
}
