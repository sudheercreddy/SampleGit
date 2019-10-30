package NaveenAutoation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_Popups {

	public static void main(String[] args) throws InterruptedException {
		//no consolse data
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"G:\\Prac_data\\testlog.txt");//no file will be generated at console
		WebDriver driver= new FirefoxDriver ();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(5000);
		String aa= alert.getText();
		alert.accept();
		driver.findElement(By.id("login1")).sendKeys("HI There");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(5000);
		String aa1= alert.getText();
		System.out.println(aa);
		System.out.println(aa1);
		if(aa1.equals("Please enter your password")){
			System.out.println("pass");
		}else{
			System.out.println("fail");
		}
		driver.quit();
	}

}
