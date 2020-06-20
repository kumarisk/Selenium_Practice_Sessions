package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/*	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test@gamil.com");
		String value = driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);*/
		
		WebElement user = driver.findElement(By.name("firstname"));
		user.sendKeys("hello-world");
		String val = user.getAttribute("value");
		System.out.println(val);
		

	}

}
