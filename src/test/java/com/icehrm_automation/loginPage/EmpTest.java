package com.icehrm_automation.loginPage;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.PropertyHandling;

public class EmpTest extends BaseClass {
	PropertyHandling propertyHandling;
	@BeforeClass
	public void before() {
		propertyHandling=new PropertyHandling();
	}
	@Test
	public void login() {
		String url=propertyHandling.getProperty("icehrmUrl");
		launchBrowser("chrome");
		driver.navigate().to(url);
		String username=propertyHandling.getProperty("icehrmUsername");
		enterText(By.name("username"),username);
		String password=propertyHandling.getProperty("icehrmPassword");
		enterText(By.name("password"),password);
		click(By.xpath("//button[contains(text(),'Log in ')]"));
	}
@Test
public void test() {
	String url=propertyHandling.getProperty("icehrmUrl");
	System.out.println(url);
}
}
