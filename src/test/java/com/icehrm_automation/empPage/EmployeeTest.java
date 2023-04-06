package com.icehrm_automation.empPage;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.pages.EmployeePage;
import com.icehrm_automation.pages.LoginPage;
import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.PropertyHandling;

public class EmployeeTest extends BaseClass{
	    PropertyHandling property;
	    LoginPage loginPage;
	    EmployeePage employeePage;

	    @BeforeClass
	    public void beforeClass() {
	        property = new PropertyHandling();
	        launchBrowser(property.getProperty("browser"));
	        driver.get(property.getProperty("icehrmUrl"));
	        loginPage = new LoginPage(driver);
	        employeePage = new EmployeePage();
	        String username = property.getProperty("icehrmUsername");
	        String password = property.getProperty("icehrmPassword");
	        loginPage.login(username, password);
	    }

	    @Test
	    public void verifySearchEmp() throws InterruptedException {
	        click(employeePage.employeeMenu);
	        click(employeePage.empSubMenu);
	        waitUntilElementIsClickable(employeePage.searchButton);
	        List<String> allEmpFNames = new ArrayList<>();
	        Thread.sleep(5000);
	        List<WebElement> allEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : allEmpDetails) {
	            String firstName = element.getText();
	            allEmpFNames.add(firstName);
	        }
	        String lastEmpName = allEmpFNames.get(allEmpDetails.size() - 1);
	        enterText(employeePage.searchBox, lastEmpName);
	        click(employeePage.searchButton);
	        Thread.sleep(5000);
	        List<WebElement> searchEmpDetails = driver.findElements(employeePage.allEmpInfo);
	        for (WebElement element : searchEmpDetails) {
	            String firstName = element.getText();
	            Assert.assertEquals(firstName, lastEmpName);
	        }
	    }

	    @AfterClass
	    public void afterClass() {
	        driver.close();
	    }

}
