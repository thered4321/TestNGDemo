package Library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class TakeScreenshot {
	
	public static void Takescreenshot(WebDriver driver, String ScreenshotName)
	{
		try {
			TakesScreenshot t_shot = (TakesScreenshot)driver;
			File sc_file = t_shot.getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(sc_file, new File("./Screenshots/"+ScreenshotName+".png"));
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (WebDriverException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
}
