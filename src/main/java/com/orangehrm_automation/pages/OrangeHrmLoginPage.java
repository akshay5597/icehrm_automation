package com.orangehrm_automation.pages;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass;

public class OrangeHrmLoginPage extends BaseClass{
By username=By.name("username");
By password=By.name("password");
By loginButton=By.xpath("//button[@type='sunmit']");

public void login(String username,String password) {
}
}