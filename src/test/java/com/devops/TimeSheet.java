package com.devops;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TimeSheet {
	
	WebDriver driver;
	
	@BeforeMethod 
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        
        driver.get("https://dev.azure.com/Z5X-Tech/Time%20Sheet");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
		driver.findElement(By.id("i0116")).sendKeys("sudheer.indlamudi@zee.esselgroup.com");
		
		driver.findElement(By.id("idSIButton9")).click();
		
		driver.findElement(By.id("passwordInput")).sendKeys("Welcome@2020");
		
		driver.findElement(By.id("submitButton")).click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("__bolt-create-action")).click();
	}

}
