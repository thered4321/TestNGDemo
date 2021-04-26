package com.ScreenshotDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Library.TakeScreenshot;



public class CaptureScreenshot {
		
	WebDriver driver;
		@Test
		public void FreecrmLogin() throws IOException
		{
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\TestNGDemo\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("https://ui.cogmento.com/");
			//TakeScreenshot.Takescreenshot(driver, "beforelogin");
			driver.findElement(By.name("email")).click();
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("ananddalal123@yahoo.com");
			//TakeScreenshot.Takescreenshot(driver, "Emailcheck");
			driver.findElement(By.name("password")).click();
			driver.findElement(By.name("password1")).clear();  //Delibrately making test case fail. (password)
			driver.findElement(By.name("password")).sendKeys("freecrm@123");
			//TakeScreenshot.Takescreenshot(driver, "passwordCheck");
			
		}
		@AfterMethod
		public void tearDown(ITestResult result)
		{
			if(ITestResult.FAILURE==result.getStatus())
			{
				TakeScreenshot.Takescreenshot(driver, result.getName());
			}
			driver.quit();
		}
}
