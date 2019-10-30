package NaveenAutoation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IS_displayed_emabled_visibled {

	public static void main(String[] args) throws Exception{

		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(5000);
		boolean b1= driver.findElement(By.name("remember")).isSelected();
		System.out.println(b1);
	driver.findElement(By.name("remember")).click();
	boolean b2= driver.findElement(By.name("remember")).isSelected();
	System.out.println(b2);
	boolean b3= driver.findElement(By.name("proceed")).isEnabled();
	System.out.println(b3);
	boolean b4= driver.findElement(By.name("proceed")).isDisplayed();
	System.out.println(b4);
	boolean ccc= driver.findElement(By.xpath("//div[contains(text(),'Copyright © 2019 Rediff.com India Limited. All rights reserved.')]")).isDisplayed();
	System.out.println(ccc);
	//	driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		
		//boolean chooseselect= driver.findElement(By.xpath("//input[@id='u_0_a']")).isSelected();
//System.out.println(chooseselect);
//driver.findElement(By.xpath("//input[@id='u_0_a']")).isEnabled();
	}

}
