package com.icehrm_automation.loginPage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass;

public class Sample1 extends BaseClass{
	@BeforeGroups(groups= {"sanity"})
	public void beforeGroups()
	{
	System.out.println("This is before group method");
    }
  @AfterGroups(groups= {"sanity"})
     public void afterGroups()
     {
	  System.out.println("This is after group method");
     }
	/*@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite from Sample1 class");
	}
	@AfterSuite 
	public void afterSuite() {
		System.out.println("afterSuite sample1");
	}
	@BeforeTest
	public void beforeTestSample1() {
		System.out.println("beforeTest sample1");
	}
	@AfterTest
	public void afterTests() {
		System.out.println("afterTest sample1");
	}*/
  @Test(groups={"sanity"})
  public void sample1Test1()
  {
	  System.out.println("This is sample1 class test1 method");
	  System.out.println(driver.getTitle());
  }
  @Test(groups={"sanity"})
  public void sample1Test2()
  {
	  System.out.println("This is sample1 class test2 method");
	  System.out.println(driver.getTitle());
  }
  @Test(groups={"regression"})
  public void sample1Test3()
  {
	  System.out.println("This is sample1 class test3 method");
	  System.out.println(driver.getTitle());
  }
  @Test(groups={"regression"})
  public void sample1Test4()
  {
	  System.out.println("This is sample1 class test4 method");
	  System.out.println(driver.getTitle());
  }
  @Test(groups={"regression"})
  public void sample1Test5()
  {
	  System.out.println("This is sample1 class test5 method");
	  System.out.println(driver.getTitle());
  }
  
	@BeforeClass(groups={"sanity"})
	public void beforeClass() {
		System.out.println("beforeClass sample1");
		launchBrowser("edge");
		driver.get("https://www.gooogle.com");
	}
	@AfterClass(groups={"sanity"})
	public void afterClass() {
		System.out.println("afterclass sample1");
		driver.quit();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod sample1");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod sample1");
	}
}
