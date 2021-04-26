package com.parameterTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamenterTestDemo {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","url","username","password"})
	public void FacebookLoginTest(String browser,String url,String username,String password) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
		{
			System.out.println("check browser");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Sign up for Facebook | Facebook","URL not correct");

		driver.findElement(By.xpath("//input[@value='Log In to Existing Account']")).click();
		
		WebElement name = driver.findElement(By.name("email"));
		name.clear(); 
		name.sendKeys(username);
		WebElement pswd = driver.findElement(By.name("pass"));
		pswd.clear();
		pswd.sendKeys(password);
		
		driver.findElement(By.xpath("//input[@value = 'Log In']")).click();
	}


}
