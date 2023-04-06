package com.icehrm_automation.loginPage;
import com.icehrm_automation.utility.ExcelUtil;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class ExcelTest {
	@DataProvider
	public Object[][] getTestData() throws Exception{
		ExcelUtil excelUtil=new ExcelUtil();
		String filePath="C:\\ExcelData.xlsx";
		String sheetName="Sheet1";
		return excelUtil.getExcelData(filePath, sheetName);
	}
	@Test(dataProvider="getTestData")
		public void test(String USERNAME,String PASSWORD) {
		System.out.println(USERNAME+" "+PASSWORD);
	}
}
