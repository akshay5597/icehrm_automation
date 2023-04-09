package com.icecrmhrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExamples {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver driver=new ChromeDriver();
   /* driver.get("https://cybersuccess.icehrm.com/");
	WebElement username=driver.findElement(By.id("username"));
	username.sendKeys("admin");
	WebElement password=driver.findElement(By.id("password"));
	password.sendKeys("2zuzfakn");
	Actions actions=new Actions(driver);
	*/	//actions.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Log in')]"))).build().perform();
		//actions.click(driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"))).build().perform();
		//actions.contextClick().build().perform();
		//actions.contextClick(driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"))).build().perform();
		
		driver.get("https://realestateautomation.agilecrm.com/");
		driver.findElement(By.name("email")).sendKeys("automation@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("WGHEZSBV");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("dealsmenu")).click();
		Thread.sleep(5000);
		WebElement src=driver.findElement(By.xpath("//a[contains(text(),'ABCD')]"));
		WebElement dst=driver.findElement(By.xpath("//div[@id='Prospect']//li[1]"));
		Actions actions=new Actions(driver);
		//actions.clickAndHold(src).release(dst).build().perform();
		actions.dragAndDrop(src, dst).build().perform();
		//actions.moveToElement(src).sendKeys("Text").build().perform();
		//actions.moveByOffset(300,700);
	//	actions.scrollByAmount(100,100);
			
	}

}
