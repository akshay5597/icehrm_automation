package com.icehrm_automation.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2 {
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest sample2");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest sample2");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass sample2");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass sample2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod sample2");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod sample2");
	}
	@Test
	public void test() {
		System.out.println("test sample2");
	}	
}
