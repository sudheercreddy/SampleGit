package NaveenAutoation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Object_Repository {
	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileInputStream ip= new FileInputStream("E:\\IamSelfish\\Selenium-2019\\src\\NaveenAutoation\\Config.Properties");
		prop.load(ip);
		System.out.println(prop.getProperty("name"));
	String website=prop.getProperty("url");
		String Browsername= prop.getProperty("browser");
		if(Browsername.equals("chrome")){
			driver= new ChromeDriver();
			//driver.get("https://www.gmail.com/");
			
		}else if (Browsername.equals("FF")){
			driver= new FirefoxDriver();
		//	driver.get("https://www.gmail.com/");
			
		}else if (Browsername.equals("IE")){
			driver= new InternetExplorerDriver();
			driver.manage().deleteAllCookies();
			//driver.get("https://www.gmail.com/");
		}
		
		
		driver.get(website);
		driver.findElement(By.xpath(prop.getProperty("UserName_xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("Password_xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("Button_login_homepage_xpath"))).click();
	}
}
