package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=2,groups= "sanityTest")
	public void googleTitleTest(){
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=3,groups= "smokeTest",dependsOnGroups = "sanityTest")
	public void googleLogoTest(){
		Boolean status = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/img[1]")).isDisplayed();
		
		System.out.println("Logo status: "+status);
	}
	
	@Test(priority=1,groups= "smokeTest",dependsOnGroups = "sanityTest")
	public void mailLinkTest() {
		Boolean linkStatus = driver.findElement(By.linkText("Gmail")).isDisplayed();
		System.out.println("Link status: "+linkStatus);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
}
