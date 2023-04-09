package com.icecrmhrm_automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EnterDataInExcel {

	public static void main(String[] args) {
    String filePath="C:\\Book1.xlsx"; //==> change it
    String extension=filePath.substring(filePath.indexOf(".")+1);
    Workbook workbook=null;
    try {
    	FileInputStream inputStream=new FileInputStream(filePath);
    	if(extension.equals("xlsx")) {
    		workbook=new XSSFWorkbook(inputStream);
    	} else if(extension.equals("xlx")) {
    		workbook=new HSSFWorkbook(inputStream);
    	}
    	Sheet sheet=workbook.getSheet("testData");
    	if(sheet==null) {
    		sheet=workbook.createSheet("testData");
    	}
    	Cell cell=sheet.createRow(0).createCell(0);
    	cell.setCellValue("Cyber Success");
    	FileOutputStream outputStream=new FileOutputStream(filePath); 
    	workbook.write(outputStream);
    	workbook.close();
    } catch(FileNotFoundException e) {
    	throw new RuntimeException(e);
    } catch(IOException e) {
    	throw new RuntimeException(e);
    } 
	}

}
