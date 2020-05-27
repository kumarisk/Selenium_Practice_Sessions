package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigations {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.google.com");
		
		driver.navigate().to("http://www.amazon.in");
		
	//navigate to back by clicking on the back button	
		driver.navigate().back();
		
	//navigate to forward by clicking on the forward button	
		driver.navigate().forward();
		
		driver.navigate().back();
		
	//to refresh the page	
		driver.navigate().refresh();
		

	}

}
