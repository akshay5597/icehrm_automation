package com.icehrm_automation.utility;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		protected WebDriver driver;
		public ExtentTest log;
		public ExtentReports extentReports;
		public void launchBrowser(String browser) {
			switch(browser) {
			case"chrome":
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(setChromeOptions());
				break;
			case"edge":
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver(setEdgeOptions());
				break;
			case"firefox":
			    WebDriverManager.firefoxdriver().setup();
			    driver=new FirefoxDriver(setFirefoxOptions());
				break;	
			default:
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver(setChromeOptions());
				break;
			}
		}
		                       // this method will perform click operation on the given locator
		public void click(By by) {
					try {
						// wait till the element is available for click operation
						WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
						wait.until(ExpectedConditions.elementToBeClickable(by));
						// perform click
						driver.findElement(by).click();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
		public void click(WebElement element) {
					try {
						// wait till the element is available for click operation
						WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
						wait.until(ExpectedConditions.elementToBeClickable(element));
					   element.click();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
		public void  waitUntilElementIsClickable(By by) {
					try {
						// wait till the element is available for click operation
						WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
						wait.until(ExpectedConditions.elementToBeClickable(by));
						driver.findElement(by).click();
					}
					catch(Exception e) {
						e.printStackTrace();
					}	
				}
		       // this method will perform sendKeys operation provided location(element)
		
		public void enterText(By by,String text) {
			try {
				// wait till element is available for click operation
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.presenceOfElementLocated(by));
				driver.findElement(by).sendKeys(text);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		public ChromeOptions setChromeOptions() {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("start-maximize");
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("incognito");
			option.setHeadless(false);
			option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-clocking"));
			Map<String,String> prefs=new HashMap<>(); 
			prefs.put("download.default.directory","F:\\New folder\\Selenium");
			option.setExperimentalOption("prefs",prefs);
			option.setAcceptInsecureCerts(true);
			return option;
		}
		public FirefoxOptions setFirefoxOptions() {
			FirefoxOptions option=new FirefoxOptions();
			option.addArguments("start-maximize");
			option.addArguments("incognito");
			option.setHeadless(false);
			option.addPreference("excludeSwitches",Arrays.asList("disable-popup-clocking"));
			Map<String,String> prefs=new HashMap<>(); 
			prefs.put("download.default.directory","F:\\New folder\\Selenium");
			option.addPreference("prefs",prefs);
			option.setAcceptInsecureCerts(true);
			return option;
		}
		public EdgeOptions setEdgeOptions() {
			EdgeOptions option=new EdgeOptions();
			option.addArguments("start-maximize");
			option.addArguments("incognito");
			option.setHeadless(false);
			option.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-clocking"));
			Map<String,String> prefs=new HashMap<>(); 
			prefs.put("download.default.directory","F:\\New folder\\Selenium");
			option.setExperimentalOption("prefs",prefs);
			option.setAcceptInsecureCerts(true);
			return option;
			
		}
	}

