package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageLoadAndImplicitWait {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
	//dyanamic wait-that means we saying to selenium to wait maximium 50 seconds to load page if page not loaded before 50sec then throw an exception
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		
	//dyanamic wait for elements	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	
		}

}
