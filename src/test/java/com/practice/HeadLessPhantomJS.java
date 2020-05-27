package com.practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadLessPhantomJS {

	public static void main(String[] args) {
		
		//Phantomjs internally uses Ghost Driver
		//ghostdriver--is used as JSON wire protocol--HTTP Rest calls
		//Headless browser testing
		//no browser will be launched
		//testing is happen behind the scene
		//its very fast
		//it directly interacts with your app HTML DOM
		
		File src = new File("E:\\automation extenstions\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		
		//WebDriverManager.phantomjs().setup();
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mobiles");
		
		
	


	}

}
