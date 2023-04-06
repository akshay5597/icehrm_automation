package com.icecrmhrm_automation;

import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerExample1 {
		static WebDriver driver;
		public static void selectDayFromCalender(int futureDay) { //24 feb future day =1==> it should select 25
			// click on date
		driver.findElement(By.id("onward_cal")).click();
		List<WebElement> days=driver.findElements(By.xpath("//td[@class='current day'or @class='we day'or @class'wd day']"));
		int currentday=LocalDateTime.now().getDayOfMonth(); // get todays day
		int dayToSelect=currentday+futureDay;
		for(WebElement element:days)
		{
			String day=element.getText();
			String today=String.valueOf(dayToSelect);
			if(day.equals(today))
			{
				element.click();
				break;
			}
		}
		
		}
		public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver=new ChromeDriver();
        driver.navigate().to("https://www.redbus.in/");
        Thread.sleep(1000);
        selectDayFromCalender(28);// select the date from calender 	
	}

}
