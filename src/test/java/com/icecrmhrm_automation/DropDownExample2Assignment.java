package com.icecrmhrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample2Assignment {
       public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cybersuccess.icehrm.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("2zuzfakn");
		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
		
		WebElement homeText=driver.findElement(By.xpath("//a[@class='logo']"));
		String TextValue=homeText.getText();
		if(TextValue.equals("Home")) {
			System.out.println("Sucessfully landed on the home page");
		}
		else 
		{
			throw new Exception("Not landed on the home page");
		}
	    driver.findElement(By.xpath("//span[text()='Employees']")).click();
	    
	    driver.findElement(By.xpath("//ul[@id='admin_Employees']//a[1]")).click();
		WebElement employeeNumberText=driver.findElement(By.xpath("//span[text()='Employee Number']"));
		String EmpNovalue=employeeNumberText.getText();
		if(EmpNovalue.equals("Employee Number"))
		{
			System.out.println("Sucessfully able to navigate on Employee module");
		}
		else
		{
			throw new Exception("Unable to navigate on employee module");
		}
		driver.findElement(By.xpath("//span[text()=' Add New']")).click();
		driver.findElement(By.id("employee_id")).sendKeys("1223");
		driver.findElement(By.id("first_name")).sendKeys("Abc");
		driver.findElement(By.id("middle_name")).sendKeys("Def");
		driver.findElement(By.id("last_name")).sendKeys("Xyzeskg");
		
	    driver.findElement(By.xpath("//span[text()='Select Nationality']"));
	   // remaining following portion for completion 
	    driver.findElement(By.id("birthday")).sendKeys("17/02/2023");
	    driver.findElement(By.xpath("//span[text()='Select Gender']")).click();
	    driver.findElement(By.xpath("//div[text()='Male']")).click();
	    driver.findElement(By.xpath("//span[text()='Select Marital Status']/preceding::input[1]")).click();
	    driver.findElement(By.xpath("//div[text()='Single']")).click();
	    driver.findElement(By.xpath("//span[text()='Select Ethnicity']/preceding::input[1]")).click();
	  
	    driver.findElement(By.xpath("//span[text()='Save']")).click();
	    
	    
       }
       
}
