package com.icecrmhrm_automation;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample2 {

	public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("https://cybersuccess.icehrm.com/");
			WebElement username=driver.findElement(By.id("username"));
			username.sendKeys("admin");
			WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("2zuzfakn");
			WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
			loginButton.click();
			
			Thread.sleep(5000);
			 driver.findElement(By.xpath("//span[text()='Employees']")).click(); 
			 driver.findElement(By.xpath("//ul[@id='admin_Employees']/li[1]/a")).click();
		     driver.findElement(By.xpath("//span[contains(text(),'Add New')]")).click();
		     // get the today date 
		     int currentDay= LocalDateTime.now().getDayOfMonth();
		     // LocalDateTime.now().getDayOfWeek();
		     // LocalDateTime.now().getMonthValue();
		     Thread.sleep(2000);
		     // click on calender 
		     driver.findElement(By.id("birthday")).click();
		     // get all current month days
		     List<WebElement> days=driver.findElements(By.xpath("//td[contains(@class,'ant-picker-cell-in-view')]"));
		     // iterate through each day of month
		     for(WebElement element:days)
		     {
		    	 String day=element.getText();
		    	 String today=String.valueOf(currentDay);// convert current day int value into string
		    	 if(day.equals(today)) // if currentDay is equals to the day extracted from calender then select that day
		    	 {
		    		 element.click();
		    		 
		    	 }
		    	 
		     }        
	}
}
