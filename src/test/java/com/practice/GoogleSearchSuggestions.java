package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchSuggestions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("java");
		
		List <WebElement> list = driver.findElements(By.xpath("//div[@class='aajZCb']//ul/descendant::div[@class='sbl1']"));
		
		System.out.println(list.size());
		
		//Thread.sleep(4000);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).getText());
		if(list.get(i).getText().contains("java tutorial")) {
		list.get(i).click();
		break;
		}
		}

	}

}
