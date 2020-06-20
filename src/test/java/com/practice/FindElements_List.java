package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements_List {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
	//get total no of links in the site	
		List <WebElement> ListOfLinks = driver.findElements(By.tagName("a"));
		
	//print the total no links size
		System.out.println(ListOfLinks.size());
		
	//get the text of the links
		for(int i=0; i<ListOfLinks.size(); i++) {
			String LinkText = ListOfLinks.get(i).getText();
			System.out.println(LinkText);
		
		}
		

	}

}
