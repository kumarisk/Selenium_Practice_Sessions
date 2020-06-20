package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableImagesInFirefox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		FirefoxOptions options = new FirefoxOptions();
		
		imagedisablefirefox(options);
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);

	}
	
	public static void imagedisablefirefox(FirefoxOptions options) {
		FirefoxProfile profile= new FirefoxProfile();
		profile.setPreference("permissions.default.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);
		
	}

}
