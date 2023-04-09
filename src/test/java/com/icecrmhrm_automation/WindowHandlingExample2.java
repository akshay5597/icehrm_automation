package com.icecrmhrm_automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample2 {

	public static void main(String[] args) {
     
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		System.out.println("First Tab: "+driver.getTitle());
		String firstTabId=driver.getWindowHandle();
		//System.out.println(firstTabId);
		// open new tab in the same window and switch control automatically
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//OPEN FLIPKART website
		driver.navigate().to("https://www.flipkart.com");
		System.out.println("Second Tab: "+driver.getTitle());
		driver.close();   // closing the second tab
		driver.switchTo().window(firstTabId); //switch back to first tab
		System.out.println("switched control back to first tab and Title: "+ driver.getTitle());
		driver.close();
			
	}
}
