package com.icehrm_automation.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample3 {
	/*@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest sample3");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest sample3");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass sample3");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("afterclass sample3");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod sample3");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod sample3");
	}
	@Test
	public void test(){
	System.out.println("Test");
	}*/
	@Test(priority=1,description="login")
	public void login() {
		System.out.println("login");
	}	
	@Test(priority=2,description="addEmp",dependsOnMethods="login")
	public void addEmp() {
		System.out.println("addEmp");
	}	
	@Test(priority=3,description="deleteEmp")
	public void deleteEmp() {
		System.out.println("deleteEmp");
	}
	@Test(priority=4,description="logout")
	public void logout() {
		System.out.println("logout");
	}	
}
