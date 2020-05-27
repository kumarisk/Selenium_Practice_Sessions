package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownList {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//handle dropdown
		//Create object to the select and inside the select pass the action---
		//(where we need to perform the action/pass ie: on which element we need to pass)
		
		Select select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");

	}

}
