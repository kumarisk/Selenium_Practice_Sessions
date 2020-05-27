package com.practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.amazon.in");
		
	//take screenshot and store it as a file format	
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
	//now copy file to desired location by using copyfile method	
		FileUtils.copyFile(src, new File("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Selenium_Sessions\\src\\test\\java\\com\\practice\\amazon.png"));

	}

}
