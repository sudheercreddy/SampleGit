package NaveenAutoation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "G:\\Prac_data\\testlog.txt");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src, new File ("G:\\Prac_data\\screenshot1.png"));
	}

}
