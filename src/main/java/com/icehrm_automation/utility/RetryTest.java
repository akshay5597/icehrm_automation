package com.icehrm_automation.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {
    int count=0;
    int maxcount=2;
    public boolean retry(ITestResult result) {
    	if(!result.isSuccess()) {
    		if(count<=maxcount) {
    			count++;
    			result.setStatus(ITestResult.FAILURE);
    			return true;
    		}else {
    			result.setStatus(ITestResult.FAILURE);
    		}
    	}else {
    		result.setStatus(ITestResult.SUCCESS);
    	}
    	return false;
    }
}
