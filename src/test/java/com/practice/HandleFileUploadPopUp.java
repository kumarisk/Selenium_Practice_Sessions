package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Bzinga\\test-output\\index.html");

	}

}
