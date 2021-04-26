package com.retryLogic.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogicDemo {
	
	@Test(priority = 1, retryAnalyzer = com.retryLogic.Test.RetryListener.class)
	public void GoogleTitleTest()
		{
			System.out.println("Testing Google Title");
			
		}
	@Test(priority = 2,retryAnalyzer = com.retryLogic.Test.RetryListener.class)
	public void GoogleLoginTest()
	{
		System.out.println("Testing Google Login");
		//int c= 1/0;
	}
	
	@Test(priority = 3,retryAnalyzer = com.retryLogic.Test.RetryListener.class)
	public void Google()
	{
		System.out.println("Testing Google");
		Assert.assertTrue(0>1);
	
	}

}
