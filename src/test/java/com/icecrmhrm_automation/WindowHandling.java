package com.icecrmhrm_automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.navigate().to("https://www.amazon.in/");
       String parentWindowId=driver.getWindowHandle(); // return the id of currrent window
       System.out.println("First tab Id: "+parentWindowId);
       Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='navSwmHoliday']/a")).click();
		Set<String> allIds=driver.getWindowHandles(); // get all windows ids
		System.out.println("Print all Window Ids");
		for(String id:allIds)
		{
			if(!id.equals(parentWindowId))
			{
			System.out.println("Second Tab Id: "+id);
			driver.switchTo().window(id);// switch the control from first tab to Second Tab
			System.out.println("Control switched from first tab to second tab");
			String secondTabTitle=driver.getTitle(); // get the title of second window
			System.out.println("Second Tab Title: "+ secondTabTitle);
			driver.close();
			}
		}
		driver.switchTo().window(parentWindowId);// switch control second tab to first
		String firstTabTitle=driver.getTitle(); // get the tile of first tab
		System.out.println("Control switched from second tab to first tab");
		System.out.println("First Tab Title: "+firstTabTitle);// print title of first tab
		driver.quit();// close all tabs
		
	}

}
/*List<WebElement> links=driver.findElements(By.tagName("img"));    // get all elements with tagname "img"
for(int i=3;i<=links.size();i++)
{
	WebElement element=links.get(i);                            // get single element from array
	String url=element.getAttribute("src");                    
    System.out.println(url);
}
*/
