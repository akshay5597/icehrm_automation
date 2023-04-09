package com.icecrmhrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownExample2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");         // enter username
		driver.findElement(By.name("password")).sendKeys("admin123");      // enter password
		driver.findElement(By.xpath("//button[@type='submit']")).submit(); // click on login button
	    Thread.sleep(5000); // wait for 5 sec
		String dashboardText=driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText(); // get the text of Dashboard field
		if(dashboardText.equals("Dashboard"))
		{// check is actual and expected result is same
			System.out.println("Successfully landed on the homepage of an application"); // if same print success message
		}
		else
		{
			throw new Exception("Failed to login to application"); // if not then print this message
		}
		driver.findElement(By.xpath("//span[text()='PIM']")).click(); // click on PIM module
		Thread.sleep(3000); // wait for 3 sec
		//locate to search button on PIM module
		WebElement searchButton=driver.findElement(By.xpath("//button[@type='reset']/following-sibling::button"));// locate search button on PIM module
		
		if(searchButton.isDisplayed()) // check if search button is displayed on the screen 
		{
			System.out.println("Successfully able to navigate on PIM module");// if displayed print success message
			if(searchButton.isEnabled())
			{
				System.out.println("search button is enabled on the screen");	
			}
			else
			{
				System.out.println("search button is disabled on the screen");
			}
		}
		else
		{
			System.out.println("Unable to navigate on PIM module"); // if not then print this message
		}
		
		driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[3]")).click(); //click on employee status dropdown
		List<WebElement> empStatusDropDownValues= driver.findElements(By.xpath("//div[@role='listbox']//span")); // get all dropdown value elements
		for(int i=0;i<empStatusDropDownValues.size();i++)
		{
		WebElement element=empStatusDropDownValues.get(i);
		String value=element.getText();
		// if the value is Part-Time Contract then print the value first and select it
		if(value.equals("Part-Time Contract"))
		{
			System.out.println(value);
			element.click();
			break;
		}
		}
		// confirm that the Part-Time Contract value is selected or notin the employee Status DropDown
		String selectedValue=driver.findElement(By.xpath("//label[text()='Employment Status']/following::div[4]")).getText();
		if(selectedValue.equals("Part-Time Contract")) {
			System.out.println("Successfully able to select Part-Time Contract in Employee Status Dropdown");
		}
		else
		{
			throw new Exception("unable to select Part-Time Contract in Employee Status DropDown");
		}
		driver.close();
	}

}
