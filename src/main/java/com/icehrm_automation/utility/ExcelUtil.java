package com.icehrm_automation.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
     private Workbook workbook;
       private Sheet sheet;
       
       public Object[][] getExcelData(String filePath,String sheetName) throws Exception{
    	  //C:\ExcelData.xlsx
    	   try {
    		   FileInputStream inputStream=new FileInputStream(filePath);
    		   String extension=filePath.substring(filePath.indexOf(".")+1);
    		   System.out.println(extension);
    		   if(extension.equals("xlsx"))
    		   {
    			   workbook=new XSSFWorkbook(inputStream);
    		   }
    		   else {
    			   workbook=new HSSFWorkbook(inputStream);
    		   }
    		 sheet=workbook.getSheet(sheetName);
    		 int totalRows=sheet.getPhysicalNumberOfRows();
    		 int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
    		   // create two dimensional object with total rows and columns
    		 Object[][] object=new Object[totalRows-1][totalColumns];
    		 // iterate with for loop
    		 for(int i=1;i<totalRows;i++) {
    			 for(int j=0;j<totalColumns;j++) {
    				Cell cell=sheet.getRow(i).getCell(j);
    				if(cell.getCellType().equals(CellType.STRING)) {
    					object[i-1][j]=cell.getStringCellValue();
    				}else if(cell.getCellType().equals(CellType.NUMERIC)) {
    					object[i-1][j]=cell.getNumericCellValue();
    				}else if(cell.getCellType().equals(CellType.BLANK)) {
    				System.out.println("Blank Value");
    				object[i-1][j]=null;
    				}
    			 }
    		 }
    		workbook.close();
    		inputStream.close();
    		return object;
    	   }catch(IOException e) {
    		   throw new RuntimeException(e);
       }
       }
}
