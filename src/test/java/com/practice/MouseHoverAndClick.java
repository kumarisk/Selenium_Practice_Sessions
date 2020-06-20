package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(7000);
		
		//creating object to actions class
		Actions action = new Actions(driver);
		
		Thread.sleep(300);
		action.moveToElement(driver.findElement(By.xpath("//li[@id=\"header-addons\"]"))).build().perform();
	
			
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("SpiceMax")).click();
		

	}

}
