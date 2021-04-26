package com.retryLogic.Test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import Library.TakeScreenshot;

public class RetryListener implements IRetryAnalyzer {
	 
	  private int retryCount = 0;
	  private static final int maxRetryCount = 4;
	 
	  @Override
	  public boolean retry(ITestResult result) {
	    if (retryCount < maxRetryCount) {
	    	retryCount++;
	      return true;
	    }
	    return false;
	  }
	}
