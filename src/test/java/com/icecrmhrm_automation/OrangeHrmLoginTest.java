package com.icecrmhrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginTest {

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
		}
		else
		{
			System.out.println("Unable to navigate on PIM module"); // if not then print this message
		}
		WebElement selectAllCheckbox=driver.findElement(By.xpath("//div[@role='rowgroup'][1]/descendant::i[1]"));// locate select all check box
		selectAllCheckbox.click();        // click on select all check boxes 
		if(selectAllCheckbox.isSelected())
		{//check if all check boxes are selected
			System.out.println("Select all check box is selected");// if yes print this message	
		}
		else
		{
			System.out.println("Select all check box is not selected"); // if not then print this mesage
		}
		}	
	}

