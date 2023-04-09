package com.icecrmhrm_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginTest {

	public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
       // FirefoxOptions firefoxoptions=new FirefoxOptions();
		//setup chromedriver file in system class
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	//	System.getProperty("webdriver.msedge.driver","msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");//--> driver problem
		//System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
		
		//create instance of chromedriver class to launch the browser
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new EdgeDriver();
		WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new InternetExplorerDriver();
		
		//navigate to ice hrm website
		driver.get("https://cybersuccess.icehrm.com/");
		//Locate username text box on the login Screen
		//WebElement --> Interface
		//username --> reference variable
		//driver --> reference variable of chrome driver instance
		//findelement --> method which is used to locate element based on provided locator
		//By --> By is a class
		// id --> static method of By class
		WebElement username=driver.findElement(By.id("username"));
		
		//enter the text (admin) in the username field
		username.sendKeys("admin");
		
		//enter the text (2zuzfakn)in the password field
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		
		//Locate the login button and perform click operation
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		loginButton.click();
		//driver.close();
	   
    	String homeText=driver.findElement(By.xpath("//div[@id='iceloader']/preceding::span[1]")).getText();
		System.out.println(homeText);
		if(homeText.equals("Home"))
		{
			System.out.println("Test case is Passed");	
		}
		else
		{
			System.out.println("Failed to login to button");//throw new exception ("failed to login to application) 
		}
		
		driver.findElement(By.xpath("//a[@href=\"https://icehrm.com/app/cybersuccess/logout.php\"]/preceding::span[1]")).click();
	    driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	    String loginText=driver.findElement(By.xpath("//h3[contains(text(),'Login')]")).getText();
		System.out.println(loginText);
	
	    if(loginText.equals("Log in"));
	    {
	    	System.out.println("signout Successful, test case passed");
	    }	    

	
	    //verify username with valid username and invalid password
	 /*   WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("admin");
	    WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("1325jukuu");
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		loginButton.click();
		*/
		 //verify username with invalid username and valid password
	 /*   WebElement username=driver.findElement(By.id("username"));
	    username.sendKeys("manager");
	    WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("2zuzfakn");
		WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
		loginButton.click();
		
		String loginfailed=driver.findElement(By.xpath("//div[@role='alert']")).getText();
		System.out.println(loginfailed);
		if(loginfailed.equals("Loginfailed"))
		{
			System.out.println("Test case is Passed");	
		}
		else
		{
			System.out.println("Failed to login,Test is failed");//throw new exception ("failed to login to application) 
		}
		
		//verify with invalid username and invalid password
		/* WebElement username=driver.findElement(By.id("username"));
		    username.sendKeys("");
		    WebElement password=driver.findElement(By.id("password"));
			password.sendKeys("");
			WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),\"Log in\")]"));
			loginButton.click();
			
			String loginfailed=driver.findElement(By.xpath("//div[@role='alert']")).getText();
			System.out.println(loginfailed);
			if(loginfailed.equals("Loginfailed"))
			{
				System.out.println("Test case is Passed");	
			}
			else
			{
				System.out.println("Failed to login");//throw new exception ("failed to login to application) 
			}
			*/
		
		
		
		
	}

}
