package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessFirefox {

	public static void main(String[] args) {
		
		FirefoxBinary firefoxbinary = new FirefoxBinary();
		firefoxbinary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(firefoxbinary);
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mobiles");
		

	}

}
