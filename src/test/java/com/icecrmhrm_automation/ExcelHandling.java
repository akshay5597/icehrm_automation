package com.icecrmhrm_automation;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelHandling {
	 public static void main(String[] args){
       String filePath="C:\\Book1.xlsx"; // check the Filepath
	    String extension=filePath.substring(filePath.indexOf(".")+1);
	    System.out.println(filePath);
	    Workbook workbook=null;
		 try {
			 FileInputStream inputStream=new FileInputStream(filePath);
			 if(extension.equals("xlx")) {
				 workbook=new XSSFWorkbook(inputStream);
			 } else if(extension.equals("xlx")) {
				 workbook=new HSSFWorkbook(inputStream);
			 }
			 Sheet sheet=workbook.getSheet("credentials");//access the sheet with workbook reference
			 int totalRows=sheet.getPhysicalNumberOfRows();// get total number of rows
			 int totalColumns=sheet.getRow(0).getPhysicalNumberOfCells();
			 for(int i=1;i<totalRows;i++) {
				 for(int j=0;j<totalColumns;j++) {
				//	 String value=sheet.getRow(j).getCell(j).getStringCellValue();
					 Cell cell=sheet.getRow(i).getCell(j);
					 CellType cellType=cell.getCellType();// check the cell type 
					 if(cellType.equals(CellType.NUMERIC)) {
						 System.out.println(cell.getNumericCellValue()+" "); 
					 } else if(cellType.equals(CellType.STRING)) {
						 System.out.println(cell.getStringCellValue());
					 } else if(cellType.equals(cellType._NONE)) {
						 System.out.println();
					 } else if(cellType.equals(CellType.ERROR)) {
						 System.err.println(cell.getErrorCellValue());
					 }
				 }
				 System.out.println();
			 }
		 workbook.close();
		 
		 } catch(IOException e) {
			 throw new RuntimeException(e);
		 }
	   }


	              
	    }	

		