package ParallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {

	static WebDriver driver;
	
	@Test(groups = {"sanity"})
	public static void testGoogle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\TentNGDemo\\TestNGDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("I am in testGoogle and the thread ID is: " +Thread.currentThread().getId());
		driver.quit();
	}
	@Test(groups = {"smoke"})
	public static void testYahoo()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\git\\TentNGDemo\\TestNGDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/?p=us");
		System.out.println("I am in testYahoo and the thread ID is: "+Thread.currentThread().getId());
		driver.quit();
	}
	
}
