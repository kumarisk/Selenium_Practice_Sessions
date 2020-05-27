package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessChrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\automation extenstions\\chromedriver_win32\\chromedriver.exe");
				
	//create object for chromeoptions class
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size=1400,800");
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.ebay.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mobiles");
		

	}

}
