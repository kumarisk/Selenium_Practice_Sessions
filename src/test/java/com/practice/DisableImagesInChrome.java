package com.practice;

import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImagesInChrome {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		
		ImageDisable(options);
		WebDriver driver= new ChromeDriver(options);
		driver.get("https://amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	
	public static void ImageDisable(ChromeOptions options) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images",2);
		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.putIfAbsent("profile.default_content_setting_values", images);
		
		options.setExperimentalOption("prefs", prefs);
	
	}

}
