package NaveenAutoation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "G:\\Prac_data\\testlog.txt");
		WebDriver driver= new FirefoxDriver();
	//	driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.spicejet.com/");
	
		//Handling mouse over 
		Actions mousehover= new Actions(driver);
		//mousehover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Add-Ons')]"))).build().perform();
		Thread.sleep(3000);
		mousehover.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'MENU')]"))).build().perform();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[contains(text(),'Travel Info")).click();
		
		mousehover.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Travel Info')]"))).build().perform();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Terms of Carriage')]")).click();driver.quit();
//driver.close();
	}

}
