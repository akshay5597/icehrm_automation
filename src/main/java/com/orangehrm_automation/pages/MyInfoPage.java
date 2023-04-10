package com.orangehrm_automation.pages;

import org.openqa.selenium.By;

import com.icehrm_automation.utility.BaseClass;

public class MyInfoPage extends BaseClass{
  public By myInfoMenu=By.xpath("//span[text()='My Info']");
  public By profileImg= By.xpath("//img[@class=\"employee-image\"]");
  public By addImg=By.xpath("//button[@class=\"oxd-icon-button employee-image-action\"]");
  public By saveButton=By.xpath("");
}
