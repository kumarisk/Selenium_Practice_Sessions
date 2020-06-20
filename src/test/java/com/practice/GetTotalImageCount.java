package com.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTotalImageCount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	/*	driver.get("http://www.amazon.in");
		List<WebElement> imagesList = driver.findElements(By.tagName("img"));
		System.out.println(imagesList.size());
			for(int i=0; i<imagesList.size(); i++){
			String imageUrl = imagesList.get(i).getAttribute("src");
			System.out.println(imageUrl);
		}*/
		
		driver.get("https://qa.jaleshcruises.com/");
		
		List <WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		for(int i=0; i<images.size(); i++) {
			String imgs = images.get(i).getAttribute("src");
			System.out.println(imgs);
		}

	}

}
