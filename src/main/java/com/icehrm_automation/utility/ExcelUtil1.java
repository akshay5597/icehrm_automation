package com.icehrm_automation.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil1 {
	private Workbook workbook;
    private Sheet sheet;

    public Object[][] getExcelData(String filePath, String sheetName) {
        // C:/Book2.xlsx
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            String extension = filePath.substring(filePath.indexOf(".") + 1);
            System.out.println(extension);
            if (extension.equals("xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            } else {
                workbook = new HSSFWorkbook(inputStream);
            }
            sheet = workbook.getSheet(sheetName);
            int totalRows = sheet.getPhysicalNumberOfRows();
            int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
            //create 2 dimentional object with total rows and columns
            Object[][] object = new Object[totalRows - 1][totalColumns];

            for (int i = 1; i < totalRows; i++) {  // to iterate through rows
                for (int j = 0; j < totalColumns; j++) {
                    Cell cell = sheet.getRow(i).getCell(j);
                    if (cell.getCellType().equals(CellType.STRING)) {
                        object[i - 1][j] = cell.getStringCellValue();
                    } else if (cell.getCellType().equals(CellType.NUMERIC)) {
                        object[i - 1][j] = cell.getNumericCellValue();
                    } else if (cell.getCellType().equals(CellType.BLANK)) {
                        System.out.println("Blank Value");
                        object[i - 1][j] = null;
                    }

                }
            }
            workbook.close();
            inputStream.close();
            return object;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public Object[][] getEmpData(String filePath, String sheetName) {
        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            String extension = filePath.substring(filePath.indexOf(".") + 1);
            System.out.println(extension);
            if (extension.equals("xlsx")) {
                workbook = new XSSFWorkbook(inputStream);
            } else {
                workbook = new HSSFWorkbook(inputStream);
            }
            sheet = workbook.getSheet(sheetName);
            int totalRows = sheet.getPhysicalNumberOfRows();
            int totalClolumns = sheet.getRow(0).getPhysicalNumberOfCells();
            //create 2 dimentional object with total rows and columns
            Object[][] object = new Object[totalRows - 1][1];
            EmpDetails empDetails = new EmpDetails();

            for (int i = 1; i < totalRows; i++) {  // to iterate through rows
                double id = sheet.getRow(i).getCell(0).getNumericCellValue();
                empDetails.setId(id);
                String firstName = sheet.getRow(i).getCell(1).getStringCellValue();
                empDetails.setFirstName(firstName);
                String middleName = sheet.getRow(i).getCell(2).getStringCellValue();
                empDetails.setMiddleName(middleName);
                String lastName = sheet.getRow(i).getCell(3).getStringCellValue();
                empDetails.setLastName(lastName);
                String profile = sheet.getRow(i).getCell(4).getStringCellValue();
                empDetails.setProfile(profile);
                double salary = sheet.getRow(i).getCell(5).getNumericCellValue();
                empDetails.setSalary(salary);
                String city = sheet.getRow(i).getCell(6).getStringCellValue();
                empDetails.setCity(city);
                String company = sheet.getRow(i).getCell(7).getStringCellValue();
                empDetails.setCompany(company);
                object[i - 1][0] = empDetails;
            }
            workbook.close();
            inputStream.close();
            return object;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
}
}
