package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel1 {

	public static void main(String[] args) throws IOException {
//		File fi=new File("C:\\Users\\HP\\Desktop\\exceldata\\Data.xlsx");
//		FileInputStream file =new FileInputStream(fi);
//		
//		//workbook-sheet-row-cell
//	 //	retreive workbook from file
//		 XSSFWorkbook workbook = new XSSFWorkbook(file);
//		 
//		 //to get sheet from workbook
//		   XSSFSheet sheet = workbook.getSheet("Sheet2");
//		   
//		           int totalrows = sheet.getLastRowNum();
//		           
//		        short totalcell = sheet.getRow(1).getLastCellNum();
//		        
//		        
//		        for(int r=0; r<=totalrows; r++) {
//		        	       XSSFRow curruntrow = sheet.getRow(r);
//		        	       
//		        	
//		        	for(int c=0; c<totalcell; c++) {
//		        		
//		        		
//		        		XSSFCell cell = curruntrow.getCell(c);
////                                if(cell==null) {
////                                	System.out.println("cell is null");
////		        			      continue;
//		        		//}
//		        		System.out.print(cell.toString()+ "\t");
//		        	}
//		        	System.out.println();
//		        }
//		           
//		   
//		 
		     //workbook - sheet- row- cell
		      FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\exceldata\\data2.xlsx");   //for reading mode 
		 
		           XSSFWorkbook workbook=new XSSFWorkbook(file);
		           
		                  XSSFSheet sheet = workbook.getSheet("dynamicsheet");
		                     //total rows
		                     int totalrow = sheet.getLastRowNum();
		                     //total cell
		                     
		                         int tottalcell = sheet.getRow(1).getLastCellNum();
		                               
		                              System.out.println("row" + totalrow); 
		                              System.out.println("cell"+ tottalcell);
		                            
		                              for(int r=0; r<=totalrow; r++) {
		                            	     XSSFRow curruntrow = sheet.getRow(r);
		                            	  for(int c=0; c<tottalcell; c++) {
		                            		  
		                            	XSSFCell cell = curruntrow.getCell(c);
		                            	System.out.print(cell.toString() + "\t");
		                            		  
		                            	  }
		                            	  System.out.println();
		                              }
	}
}
