package com.icehrm_automation.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	@AfterSuite 
	public void afterSuite() {
		System.out.println("afterSuite");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@Test
	public void test() {
		System.out.println("test");
	}	
}
