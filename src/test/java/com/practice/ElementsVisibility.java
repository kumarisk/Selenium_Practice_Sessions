package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsVisibility {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
	//isDisplayed() method--Applicable for all elements
		boolean displayed = driver.findElement(By.xpath("//i[@class='fb_logo img sp_DVvTt_Dqodp sx_b906b8']")).isDisplayed();
		System.out.println(displayed);
		
	//isEnabled() method----
		boolean enabled = driver.findElement(By.id("u_0_b")).isEnabled();
		System.out.println(enabled);
		
	//isSelected() method---only applicable to "check boxs, drop down, radio butrtons"
		boolean selected = driver.findElement(By.xpath("//input[@value='2']")).isSelected(); //with out selecting male
		System.out.println(selected);
		
	//select male	
		driver.findElement(By.xpath("//input[@value='2']")).click(); 
	
	//verifying the element is selected or not after selecting the male	
		boolean selected1 = driver.findElement(By.xpath("//input[@value='2']")).isSelected();
		System.out.println(selected1);
		
	

	}

}
