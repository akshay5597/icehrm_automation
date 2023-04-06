package com.icecrmhrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExamples {

	public static void main(String[] args) {
   
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.navigate().to("https://cybersuccess.icehrm.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver; // Upcasting
		// scroll operations
		//js.executeScript("window.scrollBy(0,500)"); // scroll down by 500px
		//js.executeScript("window.scrollBy(0,-500)"); // scroll up by 500px 
		    // java script to scroll page at bottom
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		/*WebElement usernameText=driver.findElement(By.xpath("//input[@id='username']/preceding::label"));
		// get the text present on provided element through javascript in object
		Object value=js.executeScript("returm document.getElementById('placeholder').value",usernameText);
		
		String text=(String)value; // convert object into the String
		
		System.out.println(text); // print the String value
		*/
		WebElement username=driver.findElement(By.id("username"));
		js.executeScript("arguments[0].value='admin'",username);
		
		WebElement password=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].value='2zuzfakn'",password);
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		js.executeScript("arguments[0].click();",loginButton);
		
		
	}
}
