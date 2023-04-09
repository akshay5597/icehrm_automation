package com.icecrmhrm_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExampleAssignment {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		 WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));//locate the search dropdown
		 Select select=new Select(searchDropDown); // there is select tag is present so we will use the select class & its method for finding dropdown value(specific value)
		 select.selectByValue("search-alias=electronics"); // to enter specific value of that attribute which we will can search in searchbox
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("washing machine");
			driver.findElement(By.id("nav-search-submit-button")).click();
			Thread.sleep(1000);
			int totalResult; // declare a local variable to store all the search result
			List<WebElement> washingmachineResults=driver.findElements(By.xpath("//div[starts-with(@data-cel-widget,'search_result_')]/descendant::h2//span"));// dynamic xpath to find all results
		
			totalResult=washingmachineResults.size();  // get the total size of an mobileResults (array)
			System.out.println("Total Result: " + totalResult);  // print the total results we have found
			for(int i=3;i<=totalResult;i++)
			{
				try {
					String nameXpath= "//div[starts-with(@data-cel-widget,'search_result_')]["+ i +"]/descendant::h2//span";
					//System.out.println(nameXpath);
					String priceXpath="//div[starts-with(@data-cel-widget,'search_result_')]["+ i +"]/descendant::span[@class='a-price-whole']";
					String washingmachineName=driver.findElement(By.xpath(nameXpath)).getText();
					String washingmachinePrice=driver.findElement(By.xpath(priceXpath)).getText();
					System.out.println("Price : " + washingmachinePrice + "  Name :" + washingmachineName);
			    	}
			catch(NoSuchElementException e) {
					// Remaing part of assignment--> use method to remove the "," between price and print the machines whos price is <20000
			}
				
		}
	}
}
