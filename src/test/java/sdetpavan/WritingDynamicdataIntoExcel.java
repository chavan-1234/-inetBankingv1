package sdetpavan;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicdataIntoExcel {
      public static void main(String[] args) throws IOException {
		
    	 //write data in excel
    	  FileOutputStream file=new FileOutputStream("C:\\Users\\HP\\Desktop\\exceldata\\data2.xlsx");
    	  
    	    //   workbook-sheet-row-cell
    	  
    	  XSSFWorkbook workbook=new XSSFWorkbook();
    	   
    	             XSSFSheet sheet = workbook.createSheet("dynamicsheet");
    	             
    	             Scanner sc= new Scanner(System.in);
    	             
    	             System.out.println("enter row");
    	             
    	                    int totalrow = sc.nextInt();
    	                 
    	                    System.out.println("enter cell");
    	                    
    	                   int totalcell = sc.nextInt();
    	                   
    	                   for( int r=0 ; r<=totalrow; r++) {
    	                	         XSSFRow curruntrow = sheet.createRow(r);
    	                	   for(int c=0; c<totalcell; c++) {
    	                		    XSSFCell cell = curruntrow.createCell(c);
    	                		    cell.setCellValue(sc.next());
    	                		   
    	                		   
    	                	   }
    	                   }
    	                   
    	                   workbook.write(file);
    	                    
    	             
    	              System.out.println("file is created");
    	             
    	             
    	             
    	  
	}
}
