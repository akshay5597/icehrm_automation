package com.icehrm_automation.loginPage;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass;

public class LoginTest1 {
	public class LoginTest extends BaseClass {
		@BeforeClass
		public void beforeClass() {
			System.out.println("This is before class method");
			// launch browser and navigate to icehrm
		  launchBrowser("edge");
	  	  driver.navigate().to("https://cybersuccess.icehrm.com/");  	 
		}
	   @AfterClass
	   public void afterClass() {
		   System.out.println("This is after class method");
		  driver.close(); // close the browser instance 
	   }
	   @Test
	   public void verifyLoginWithValidCred() throws Exception {
		   System.out.println("This is login with valid credentials Test method");
		   //login to application
		   launchBrowser("firefox");
	 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
	 	  enterText(By.id("username"),"admin");
	 	  enterText(By.id("password"),"2zuzfakn");
	 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
	 	  String loginpassed=driver.findElement(By.xpath("//span[text()='Admin']")).getText();
	 	  if(loginpassed.equals("Admin")) {
	 		System.out.println("Successfully login to Application");  
	 	  }
	 	  else {
	 		  throw new Exception("Failed to login");
	 	  }
	 	  click(By.xpath("//i[@class=\"caret\"]"));
	 	  click(By.xpath("//a[text()=\"Sign out\"]"));
	   }
	  @Test
	   public void verifyLoginWithInvalidUsernameCred() throws Exception {
		   System.out.println("This is login with Invalid username Test method");
		   launchBrowser("edge");
		 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
		 	  enterText(By.id("username"),"akash");
		 	  enterText(By.id("password"),"2zuzfakn");
		 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
		 	 String loginfailed=driver.findElement(By.xpath("//div(contains(@class,'alert-danger')]")).getText();
				if(loginfailed.equals("Login failed"))
				{
					System.out.println("Test case is Passed");	
				}
				else
				{
					throw new Exception ("failed to login to application"); 
				}
	   }
	   @Test
	   public void verifyLoginWithInvalidPasswordCred() throws Exception {
		   System.out.println("This is login with Invalid password Test method");
		   launchBrowser("edge");
		 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
		 	  enterText(By.id("username"),"admin");
		 	  enterText(By.id("password"),"24jgydrcj");
		 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
		 	 String loginfailed=driver.findElement(By.xpath("//div(contains(@class,'alert-danger')]")).getText();
				if(loginfailed.equals("Login failed"))
				{
					System.out.println("Test case is Passed");	
				}
				else
				{
					throw new Exception ("failed to login to application"); 
				}
	   } 
	   @Test
	   public void verifyLoginWithInvalidUsername2Cred() throws Exception {
		   System.out.println("This is login with Invalid username Test method");
		   launchBrowser("edge");
		 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
		 	  enterText(By.id("username"),"");
		 	  enterText(By.id("password"),"2zuzfakn");
		 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
		 	 String loginfailed=driver.findElement(By.xpath("//div(contains(@class,'alert-danger')]")).getText();
				if(loginfailed.equals("Login failed"))
				{
					System.out.println("Test case is Passed");	
				}
				else
				{
					throw new Exception ("failed to login to application"); 
				}
	}
	   @Test
	   public void verifyLoginWithInvalidPassword2Cred() throws Exception {
		   System.out.println("This is login with Invalid username Test method");
		   launchBrowser("edge");
		 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
		 	  enterText(By.id("username"),"admin");
		 	  enterText(By.id("password"),"");
		 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
		 	 String loginfailed=driver.findElement(By.xpath("//div(contains(@class,'alert-danger')]")).getText();
				if(loginfailed.equals("Login failed"))
				{
					System.out.println("Test case is Passed");	
				}
				else
				{
					throw new Exception ("failed to login to application"); 
				}
	}
	   @Test
	   public void verifyLoginWithInvalidBlankCred() throws Exception {
		   System.out.println("This is login with Invalid username Test method");
		   launchBrowser("edge");
		 	  driver.navigate().to("https://cybersuccess.icehrm.com/");
		 	  enterText(By.id("username"),"");
		 	  enterText(By.id("password"),"");
		 	  click(By.xpath("//button[text()='Log in ']"));// click on login button
		 	 String loginfailed=driver.findElement(By.xpath("//div(contains(@class,'alert-danger')]")).getText();
				if(loginfailed.equals("Login failed"))
				{
					System.out.println("Test case is Passed");	
				}
				else
				{
					throw new Exception ("failed to login to application"); 
				}
	}
	}

}
