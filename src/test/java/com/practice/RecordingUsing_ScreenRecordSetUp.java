package com.practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RecordingUsing_ScreenRecordSetUp {
	
WebDriver driver;
	
	@BeforeMethod
	public void setup(){
		System.setProperty("webdriver.chrome.driver", "E:\\automation extenstions\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void navigationTest() throws Exception{
		ScreenRecording_Setup.startRecording("navigationTest");
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		ScreenRecording_Setup.stopRecording();
	}
	
	@Test
	public void navigation_FeatureTest() throws Exception{
		ScreenRecording_Setup.startRecording("navigation_FeatureTest");
		
		driver.get("http://www.amazon.com");
		driver.navigate().to("http://www.rediff.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().forward();
		
		ScreenRecording_Setup.stopRecording();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	
	


}
