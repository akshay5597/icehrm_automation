package com.icehrm_automation.login;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass;

public class LoginTest extends BaseClass {
      String firstName="Cyber";
      String lastName="Success";
      String empId="001";
      
      @BeforeMethod
      public void beforMethod() {
    	  System.out.println("This is laynch browsr method from @BeforeMethod");
    	  launchBrowser("edge");
    	  driver.navigate().to("https://cybersuccess.icehrm.com/");
    	  enterText(By.id("username"),"admin");
    	  enterText(By.id("password"),"2zuzfakn");
    	  click(By.xpath("//button[text()='Log in ']"));// click on login button
    	  click(By.xpath("//span[text()='Employees']"));// click on Employee menu
    	  click(By.xpath("//ul[@id='admin_Employees']/li[1]/a"));// click on Employee sun menu
      }
	@Test
	public void addEmp() {
		System.out.println("This is createEmp method from @Test");
		// click on add button
  	  click(By.xpath("//div[@id='EmployeeTable']/descendant::span[contains(text(),'Add New']"));
  	  // enter emp id
  	  enterText(By.xpath("empNum"),empId);
  	  // enter firstName
  	  enterText(By.xpath("firstName"),firstName);
  	  // enter last Name
  	  enterText(By.xpath("lastName"),lastName);
  	  
	}
	@Test
	public void verifyEmp() {
		System.out.println("This is a verifyEmp method from @Test");
	}
	@AfterTest
	public void tearDown() {
		System.out.println("This is a tear down method from @AfterMethod");
	}
}
