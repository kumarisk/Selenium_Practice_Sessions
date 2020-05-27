package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriver_concept {
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
	//HtmlUnitDriver is not available in selenium 3.x version
	//to use this driver we need to download the HtmlUnitDriver jar file and add in the project
		
		//HtmlUnitDriver
			//1. it will not open the browser
			//2.performance is fast
			//3.it will not allow user actions (mousemovement,drag and drop,doubleclick)
			//4.this is also called as Ghost driver or Headless Browser
		
		WebDriver driver = new HtmlUnitDriver();
				
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.name("firstname")).sendKeys("hi");
		driver.findElement(By.name("lastname")).sendKeys("guru");
		driver.findElement(By.name("reg_email__")).sendKeys("test@gmail.com");
		
		

	}

}
