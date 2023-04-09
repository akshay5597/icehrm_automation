package com.icecrmhrm_automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassExample {

	public static void main(String[] args) throws AWTException {
       System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://icehrm.com/app/cybersuccess/login.php");
       Actions actions=new Actions(driver);
       actions.contextClick(driver.findElement(By.xpath("//a[text()='Reset Password']"))).build().perform();
       // select first option after right click by pressing Down arrow key and Enter button key 
       Robot robot=new Robot(); // Robot is a class
       robot.keyPress(KeyEvent.VK_DOWN); // keyPress is a method of Robot Class to perform Key Press operation
       robot.keyRelease(KeyEvent.VK_DOWN); // VK_DOWN is a static constant declared in KeyEvent class
       robot.keyPress(KeyEvent.VK_ENTER);  //VK_ENTER is a static constant declared in KeyEvent class
       robot.keyRelease(KeyEvent.VK_ENTER); // keyRelease is a method of Robot class to perform key release operation 
       
       robot.mouseMove(200, 400);
       
	}

}
