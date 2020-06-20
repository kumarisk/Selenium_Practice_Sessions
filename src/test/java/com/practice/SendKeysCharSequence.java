package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SendKeysCharSequence {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		
	//1.String	
		
		//search.sendKeys("mobiles");
		
		
	//2.StringBuilder
		
/*		StringBuilder input = new StringBuilder()
				.append("laptops")
				.append(" ")
				.append("mobiles")
				.append(" ")
				.append("camears")
				.append(" ");
		search.sendKeys(input);				*/
		
	//3.StringBuffer
		
/*		StringBuffer input1 = new StringBuffer()
				.append("laptops")
				.append(" ")
				.append("mobiles")
				.append(" ")
				.append("camears")
				.append(" ");
		search.sendKeys(input1);			*/
		
	//4.StringBuilder, StringBuffer, String, keys
		
		StringBuilder input = new StringBuilder()
				.append("laptops")
				.append(" ")
				.append("mobiles")
				.append(" ")
				.append("camears")
				.append(" ");
		
		
		String space = " ";
		
		StringBuffer input1 = new StringBuffer()
				.append("laptops")
				.append(" ")
				.append("mobiles")
				.append(" ")
				.append("camears")
				.append(" ");
		
		String infield = " hello world";
		
		search.sendKeys(input, space, input1, space, infield, Keys.TAB);
				
		
	}

}
