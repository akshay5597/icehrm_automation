package com.icecrmhrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperations {

	public static void main(String[] args) throws Exception {
     
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		/*WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));//locate the search dropdown
		Select select=new Select(searchDropDown);//create select class instance and pass the search dropdown element reference in the constructor
	    //select.selectByVisibleText("Electronics");// select the value from dropdown based on the provided text
		select.selectByValue("search-alias=electronics");
		//select.selectByIndex(16);// select dropdown value by index
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		*/
	/*	
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		Select select=new Select(searchDropDown);
		select.selectByIndex(14);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboard");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String keyboardText=driver.findElement(By.xpath("//span[3][contains(text(),'keyboard')]")).getText();
		if(keyboardText.equals(keyboardText))
		{
			System.out.println("Successfully landed on keyboard page");
		}
		else
		{
			throw new Exception("unable to landed on keyboard page");
		}
			
		Boolean result=driver.findElement(By.xpath("//span[contains(text(),'1-24 of over ')]")).isDisplayed();
		//result.getBoolean(keyboardText);
		//System.out.println(result);
	*/
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		Thread.sleep(5000);
		WebElement Dropdown=driver.findElement(By.xpath("//div[text()='Brand']"));
	/*	Select select=new Select(Dropdown);
		List<WebElement> dropDownvalues=select.getOptions();
		for(int i=0;i<dropDownvalues.size();i++)
		{
			WebElement element=dropDownvalues.get(i);// get element of each dropdown values
			String dropDownText=element.getText();   // get text of each dropdown value
			System.out.println(dropDownText);        // print text of dropdown values
		}
		*/
		
			
	}
}
