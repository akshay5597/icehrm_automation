package com.icecrmhrm_automation;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateInsert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("2zuzfakn");
		driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]")).click();
		
	    driver.findElement(By.xpath("//span[text()='Employees']")).click();
	    driver.findElement(By.xpath("//ul[@id='admin_Employees']//a[1]")).click();
		driver.findElement(By.xpath("//span[text()='Employee Number']"));
		driver.findElement(By.xpath("//span[text()=' Add New']")).click();
		driver.findElement(By.id("employee_id")).sendKeys("1223");
		driver.findElement(By.id("first_name")).sendKeys("Abc");
		driver.findElement(By.id("middle_name")).sendKeys("Def");
		driver.findElement(By.id("last_name")).sendKeys("Xyzeskg");
		driver.findElement(By.id("birthday")).click();
		int monthDay=LocalDateTime.now().getDayOfMonth();
		DayOfWeek day=LocalDateTime.now().getDayOfWeek();
		/*if(day.equals(String.valueOf(monthDay)))
		{
			System.out.println("CurrentDate: "+day);
		}
		
		
		*/
	}

}
