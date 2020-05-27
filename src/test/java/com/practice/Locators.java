package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
	//1.xpath---2nd priority
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("test1");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).clear();
		
	//2.id---1st priority
		driver.findElement(By.id("u_0_m")).sendKeys("test2");
		driver.findElement(By.id("u_0_m")).clear();
		
	//3.name--3rd priority
		driver.findElement(By.name("firstname")).sendKeys("test3");
		driver.findElement(By.name("firstname")).clear();
		
	//4.linkText-only for links
		driver.findElement(By.linkText("Create a Page")).click();
		
	//5.partialLinktext----not used---in this we will write starting text in the link for long links text
		driver.findElement(By.partialLinkText("Create")).click();
		
	//6.CSS--2nd priority
		//if id is there then ----#id_value
		//if class is there then -----.calss_value
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys("test4");
		driver.findElement(By.cssSelector("#u_0_m")).clear();
		
	//7.class name
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("test5");
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).clear();
		

	}

}
