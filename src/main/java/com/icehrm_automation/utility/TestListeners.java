package com.icehrm_automation.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListeners implements ITestListener,ISuiteListener {
	//String reportPath;
	//ExtentReports extentReporter;
    @Override
    public void onStart(ISuite suite) {
    	System.out.println("This is onStart of ISuite from TestListeners");
    	//String suiteName=suite.getName();
    	//System.out.println(suiteName);
    }
    @Override
    public void onFinish(ISuite suite) {
    	System.out.println("This is onFinish of ISuite from TestListeners");
    	//extentReports.flush();
    }
    @Override
    public void onStart(ITestContext context) {
    	System.out.println("This is onStart of ITestContext from TestListeners");
    }
    @Override
    public void onFinish(ITestContext context) {
    	System.out.println("This is onFinish of ITestContext from TestListeners");
    	ExtentTestManager.endTest();
    }
    @Override
    public void onTestStart(ITestResult result) {
    	System.out.println("This is onTestStart of ITestResult from TestListeners");
    	String methodName=result.getMethod().getMethodName();
        ExtentTestManager.createTest(methodName);
    }
    @Override
    public void onTestSuccess(ITestResult result) {
    	System.out.println("This is onTestSuccess of ITestResult from TestListeners");
    }
    @Override
    public void onTestFailure(ITestResult result) {
    	System.out.println("This is onTestFailure of ITestResult from TestListeners");
    	ExtentTestManager.getTest().fail(result.getThrowable());
    	//captureScreenShot(result);
    	/*String screenshotPath=reportPath+"/"+result.getMethod().getMethodName()+".jpg";
    	try {
    	TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
    	File srcFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
    	File dstFile=new File(screenshotPath);
    	FileUtils.copyFile(srcFile, dstFile);
    	}catch(IOException ignored) {
    	}
    	log.fail(result.getThrowable().getMessage());
    	log.addScreenCaptureFromPath(screenshotPath,"failed screenshot");
    }*/}
    @Override
    public void onTestSkipped(ITestResult result) {
    	System.out.println("This is onTestSkipped of ITestResult from TestListeners");
    }
}
