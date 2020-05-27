package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverManagerTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriverManager.edgedriver().setup();
//		WebDriverManager.phantomjs().setup();
//		WebDriverManager.iedriver().setup();
		
	//if we need to run in a particle version
		//WebDriverManager.chromedriver().version("2.26").setup();
		
		
		 driver = new ChromeDriver();
		
	}
	
	@Test
	public void Testing() {
		driver.get("http://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
	

}
