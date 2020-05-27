package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MaximizeWindow {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
	//to maximize the window(manage is a method)	
		driver.manage().window().maximize();

	}

}
