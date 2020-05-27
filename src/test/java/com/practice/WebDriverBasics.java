package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		//launch firefox
				
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//webdriver is interface and firefoxdriver is a class (firefoxdriver class is implementing the webdriver interface)
		
		driver.get("http://www.google.com");
		
		//get title
		String title = driver.getTitle();
			System.out.println(title);
			
		//validate title	
		if(title.equalsIgnoreCase("Google")) {
			System.out.println("Title is correct");
		}	
		else {
			System.out.println("Title is in-correct");
		}
		
		//get current URL
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		
		//get page source
//		String PageSource = driver.getPageSource();
//		System.out.println(PageSource);
		
		driver.quit();

	}

}
