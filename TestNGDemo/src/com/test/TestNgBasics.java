package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	
	@BeforeSuite
	public void One()
	{
		System.out.println("1");
	}
	@BeforeTest
	public void Two()
	{
		System.out.println("2");
	}
	@BeforeClass
	public void Three()
	{
		System.out.println("3");
	}
	@BeforeMethod
	public void Four()
	{
		System.out.println("4");
	}
	@Test
	public void Search()
	{
		System.out.println("5");
	}
	@Test
	public void find()
	{
		System.out.println("10");		
	}
	@Test
	public void look()
	{
		System.out.println("15");
	}
	@AfterMethod
	public void six()
	{
		System.out.println("6");
	}
	@AfterClass
	public void seven()
	{
		System.out.println("7");
	}
	@AfterTest
	public void eight()
	{
		System.out.println("8");
	}
	
}
