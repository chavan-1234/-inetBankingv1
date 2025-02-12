package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel2 {
       public static void main(String[] args) throws IOException {
		
    	   File file =new File("C:\\Users\\HP\\Desktop\\exceldata\\Data.xlsx");
    	   FileInputStream fis =new FileInputStream(file);
    	   
    	  //  workbook-sheet -row-cell
    	   
    	           XSSFWorkbook workbook=new XSSFWorkbook(fis);
    	           XSSFSheet sheet = workbook.getSheet("sheet2");//sheet
    	           
    	                    int totalrows = sheet.getLastRowNum();
    	                 int totalcell = sheet.getRow(0).getLastCellNum();
    	                 
    	                 for(int r=0; r<=totalrows; r++) {
    	                	 
    	                	    XSSFRow curruntrow = sheet.getRow(r);
    	                	    
    	                	    for(int c=0; c<totalcell; c++ ) {
    	                	    	
    	                	    	XSSFCell cell = curruntrow.getCell(c);
    	                	    	
    	                	             System.out.print(cell.toString() + " ");	
    	                	    	
    	                	    }
    	                	    System.out.println();
    	                	       
    	                 }
    	                 
    	                    
    	            
    	   
    	   
    	   
	}
}
