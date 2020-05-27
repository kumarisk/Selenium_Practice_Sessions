package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlertPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//handling the alert popup
		
		// alert class
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text=alert.getText();
		
		if(text.equals("Please enter a valid user name")) {
			System.out.println("Correct validation popup");
		}
		else {
			System.out.println("In-Correct validation popup");
		}
		
		alert.accept();
		
		//alert.dismiss(); //to click on the cancel button on the pop-up
	
	}

}
