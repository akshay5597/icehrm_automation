package com.icehrm_automation.loginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Sample4 {
	@Test
	public void sample4Test1() {
		System.out.println("This is test1 from sample4 class");
		Object[][] obj=new Object[][]{
				{1,2},
				{3,4}};
			System.out.println(obj[0][0]);
			System.out.println(obj[0][1]);
			System.out.println(obj[1][0]);
			System.out.println(obj[1][1]);
		}
	@Test(dataProvider="provider")
	public void test2(int a,int b) {
		System.out.println(a+" "+b);
	}
	@DataProvider
	public Object[][] provider(){
		return new Object[][] {
			{1,2},
			{3,4}
		};
	}
	@DataProvider
	public Object[][] credentials(){
		return new Object[][] {
			{"username1","password"},
			{"username2",123},
			{"username3",false},
			{"username4",""},
			{"usename5",null}
		};
	}
	@Test(dataProvider="credentials")
	public void login(String username,Object password) {
		System.out.println("username: "+username+" and password: "+password);
	}	
	}


	
