package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		//( File- workbook) - sheet - row- cell
		
		FileInputStream fis =new FileInputStream("C:\\Users\\HP\\Desktop\\exceldata\\data2.xlsx");
		
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
		 
		        XSSFSheet sheet = workbook.getSheet("dynamicsheet");
		         
		                 int totalrow = sheet.getLastRowNum();
		          int    totalcell   =sheet.getRow(0).getLastCellNum();
		          
		          for(int r=0; r<=totalrow; r++) { 
		        	    XSSFRow curruntrow = sheet.getRow(r);
		        	    
		        	    for(int c=0; c<totalcell ; c++) {
		        	    	   XSSFCell cell = curruntrow.getCell(c);
		        	    	   System.out.print(cell.toString() + " \t");
		        	    }
		        	  System.out.println();
		          }
		                 
		        
		 
		
		
	}

}
