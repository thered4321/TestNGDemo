package com.dataDrivenTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.ExcelUtils;

public class DataDrvenDemo {
	
	static WebDriver driver;
	@Test(dataProvider = "testData")
	public void verifyUser(String username,String password)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);	
		//driver.quit();
	}
	@DataProvider(name = "testData")
	public Object[][] testData()
	{
		
		Object data[][]= new Object[2][2];
		data[0][0] = "username1";
		data[0][1] = "password1";
		
		data[1][0] = "username2";
		data[1][1] = "password2";
		return data;
	}
	
	
}
