package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readdatafromexcel2 {
          
	public static void main(String[] args) throws IOException {
		
		//file-workbook- sheet- rows-cell
		
		//file class for stoaring path of the file
		File  file= new File("C:\\Users\\HP\\Desktop\\exceldata\\data2.xlsx");
		
		//reading data from file
		FileInputStream fis=new FileInputStream(file);
		
		XSSFWorkbook workbook= new XSSFWorkbook(fis);
		
		//get sheet from workbook
		         XSSFSheet sheet = workbook.getSheet("dynamicsheet");
		         
		             int totalrows = sheet.getLastRowNum();
		             
		        int totalcell = sheet.getRow(0).getLastCellNum();
		        
		        System.out.println(totalrows);
		        System.out.println(totalcell);
		        
		         
		        for(int r=0; r<=totalrows; r++) {
		        	
		        	
		        	for(int c=0; c<totalcell; c++ ) {
		        		
		        		 XSSFRow curruntrow = sheet.getRow(r);
		        		 
		        		     XSSFCell cell = curruntrow.getCell(c);
		        		     
		        		       System.out.print(cell.toString() + " \t");    
		        		 
		        	}
		        	System.out.println();
		        }
		        
		        
		        
		        
		         
		
	}
}
