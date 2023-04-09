package com.icecrmhrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//navigate to amazon.in
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		//clicks on electronics option
		driver.findElement(By.xpath("//img[@alt=\"Mobiles\"]")).click();
		
		//refresh
		driver.navigate().refresh();
		
		//back operation
		driver.navigate().back();
		
		//forward operation
		driver.navigate().forward();
		//driver.close();
		
		

	}

}
