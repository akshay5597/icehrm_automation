package com.icehrm_automation.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Listeners
public class Sample5 {
	/*@Parameters({"username","password"})
	@Test
	public void sample5Test1(@Optional String username,@Optional String password) {
	System.out.println("This is test1 from sample5 class");
	System.out.println("This is Test1 from sample5 class and username is: "+ username + " and the password is : "+ password);
	}
	@Parameters("browser")
	@BeforeClass
	public void beforeClass(@Optional String browser) {
		System.out.println("sample5 Before class");
		System.out.println("This is sample5 class and browser value is: "+ browser);
	}*/
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}
	@Test
	public void test() {
		System.out.println("Test");
	}
}
	
	
	