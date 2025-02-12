package sdetpavan;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFormExcel {
	      public static void main(String[] args) throws IOException {
			
	    	  //for reading data use fileInputstream class
	    	  
	    	  FileInputStream file=new FileInputStream("C:\\Users\\HP\\Desktop\\exceldata\\data2.xlsx");
	    	  
	    	  //extract workbook from this file object
	    	  
	    	  XSSFWorkbook workbook = new XSSFWorkbook(file);
	    	  
	    	   //extract sheet from workbook
	    	  
	    	         XSSFSheet sheet = workbook.getSheet("dynamicsheet");
	    	         
	    	           int totalrows = sheet.getLastRowNum();
	    	                   
	    	               int totalcell = sheet.getRow(1).getLastCellNum();
	    	               
	    	               System.out.println("total rows" + totalrows); //5    rows count rows from 0   
	    	               System.out.println("total cell" + totalcell);  //4   cells count from 1       
	    	  
	    	               
	    	               for(int r=0; r<=totalrows; r++) {
	    	            	   
	    	            	             XSSFRow curruntrow = sheet.getRow(r);
	    	            	   for( int c=0; c<totalcell; c++) {
	    	            		           XSSFCell cell = curruntrow.getCell(c);
	    	            		           System.out.println(cell.toString()+ "\t");
	    	            		                
	    	            		   
	    	            	   }
	    	            	  System.out.println();
	    	               }
	    	               
		}

}
