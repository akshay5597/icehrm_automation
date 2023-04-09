package com.icehrm_automation.loginPage;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.EmpDetails;
import com.icehrm_automation.utility.ExcelUtil1;

public class ExcelTest1 extends BaseClass {
	 @DataProvider
	    public Object[][] getTestData() {
	        ExcelUtil1 excelUtil = new ExcelUtil1();
	        String filePath = "C:\\Book2.xlsx";
	        String sheetName = "Sheet1";
	        return excelUtil.getExcelData(filePath, sheetName);
	    }

	    @Test(dataProvider = "getTestData")
	    public void test(String username, String password) {
	        System.out.println(username + " " + password);
	    }

	    @DataProvider
	    public Object[][] getEmpData() {
	        ExcelUtil1 excelUtil = new ExcelUtil1();
	        String filePath = "C:\\Book2.xlsx";
	        String sheetName = "TestData";
	        return excelUtil.getEmpData(filePath, sheetName);
	    }

	    @Test(dataProvider = "getEmpData")
	    public void empTest(EmpDetails empDetails) {
	        click(By.id("EmployeeMenu"));
	        click(By.id("add_new"));
	        enterText(By.id("empNum"), String.valueOf(empDetails.getId()));
	        enterText(By.id("firstName"), empDetails.getFirstName());
	        enterText(By.id("mname"), empDetails.getMiddleName());
	        enterText(By.id("lastName"), empDetails.getLastName());
	        click(By.id("save"));

	    }
}
