package com.icehrm_automation.loginPage;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.icehrm_automation.pages.LoginPage;
import com.icehrm_automation.utility.BaseClass;
import com.icehrm_automation.utility.PropertyHandling;

public class LoginTest extends BaseClass{
	PropertyHandling property;
	LoginPage loginPage;
	@BeforeClass
	public void start() {
		property=new PropertyHandling();
		launchBrowser(property.getProperty("browser"));
		driver.get(property.getProperty("icehrmUrl"));
		loginPage=new LoginPage(driver);
	}
	@Test(dataProvider="getLoginData")
	public void verifyLogin(String username,String password,String errorMsg) {
		loginPage.login(username, password);
		if(!username.isEmpty() && !password.isEmpty()) {
			String errorMessage=driver.findElement(loginPage.errorMsg).getText();
			Assert.assertEquals(errorMessage,errorMsg);
		}
	}
    
	@DataProvider
	public Object[][] getLoginData(){
		Object[][] data=new Object[][] {
			{"admin123","admin","Login failed"},
			{"admin","admin124","Login failed"},
			{"admin123","2zuzfakn","Login failed"},
			{"","",""},
			{"","2zuzfakn",""},
			{"admin","",""}
		};
		return data;
	}
}
