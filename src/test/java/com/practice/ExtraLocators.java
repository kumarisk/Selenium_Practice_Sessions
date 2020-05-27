package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
	//ByAll class	
		driver.findElement(new ByAll(By.name("firstname"),By.id("u_0_m"),By.xpath("//input[@name='firstname']"))).sendKeys("test12345");
		
	//ByIdORName class
		driver.findElement(new ByIdOrName("u_0_o")).sendKeys("enter");
		
	//Bychained class--this should be used for parents and childs(firsr we need to write parents and then the exact value)
		driver.findElement(new ByChained(By.id("u_0_p"),By.id("u_0_q"),
				By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.id("u_0_r"))).sendKeys("test@mail.com");

	}

}
