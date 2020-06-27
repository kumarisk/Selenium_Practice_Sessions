package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class essel {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://esselconnect.in/");
		
		driver.findElement(By.xpath("// input[@name='btnContinue']")).click();
		driver.findElement(By.xpath("// input[@id='txtUserName']")).sendKeys("10107138");
		driver.findElement(By.xpath("// input[@id='txtPassword']")).sendKeys("sudheerikumar@123$");
		driver.findElement(By.xpath("// input[@name='btnLogin']")).click();
		
		//driver.switchTo().frame();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='bodyArea']//div[@id='ctl00_mnuMain']//li[@class='rmItem ']//img[@src='https://www.esselconnect.in/images/MenuImg/hrms.jpg']")))
		.build().perform();
		//action.moveToElement(driver.findElement(By.xpath("/html/body/form/div[4]/div/div[2]/div/ul/li[4]/a/img")))
		//.build().perform();
		//action.moveToElement(driver.findElement(By.cssSelector(".rmFocused > .rmLeftImage"))).build().perform();
		
	//	/html/body/form/div[4]/div/div[2]/div/ul/li[4]/a/img
		

	}

}
