package com.icecrmhrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      WebDriver driver =new  ChromeDriver();
      driver.get("https://www.amazon.in/");
      
      WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));//locate the search dropdown
		Select select=new Select(searchDropDown);//create select class instance and pass the search dropdown element reference in the constructor
	    //select.selectByVisibleText("Electronics");// select the value from dropdown based on the provided text
		select.selectByValue("search-alias=electronics");
		//select.selectByIndex(16);// select dropdown value by index
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(1000);
		int totalResult;
		// get all the search result
		List<WebElement> mobileResults=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));
		// get the total size of an mobileResults (array)
		totalResult=mobileResults.size();
		System.out.println("Total Result: " + totalResult);
		
		for(int i=3;i<=totalResult;i++)
		{
			try {
				String nameXpath= "//div[starts-with(@data-cel-widget,'search_result_')][" + i + "]/descendant::h2//span";
				//System.out.println(nameXpath);
				String priceXpath="//div[starts-with(@data-cel-widget,'search_result_')][" + i + "]/descendant::span[@class='a-price-whole']";
				String mobileName=driver.findElement(By.xpath(nameXpath)).getText();
				String mobilePrice=driver.findElement(By.xpath(priceXpath)).getText();
				System.out.println("Price : " + mobilePrice + " Name :" + mobileName);
			}
			catch(NoSuchElementException e)
			{
			//System.out.println(e.getMessage());	
				
			}
		}	
	}
}
