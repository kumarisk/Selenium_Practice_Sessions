package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mobiles");
							//or
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("laptops");
							//or
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("mobiles");
		
		//scenario:
					//dynamic id:tag=input
				//id=test_123
		
			//starts-with method in xpath
				//id=test_567
				//id=test_12356_test
		
		//driver.findElement(By.xpath("//input[starts-with(@type,'text_')]")).sendKeys("1234");
		
			//ends-with method in xpath
				//id=345_test
				//id=12356_test
		
		//driver.findElement(By.xpath("//input[ends-with(@type,'_test')]")).sendKeys("drtyui");
		
		//xpath for links(text() is a function)
		
		driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
		
		
		

	}

}
