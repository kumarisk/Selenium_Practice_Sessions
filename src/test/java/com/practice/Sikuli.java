package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed {
		
		System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
	//create a object for screen class
		Screen s = new Screen();
		
		Pattern Fn = new Pattern("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Selenium_Practice_Sessions\\src\\test\\java\\Sikuli_FB_FN.PNG");
		s.wait(Fn,2000);
		s.type(Fn,"test");
		
		Pattern Ln = new Pattern("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Selenium_Practice_Sessions\\src\\test\\java\\Sikuli_FB_LN.PNG");
		s.wait(Ln,2000);
		s.type(Ln,"hi");
		
		Pattern Email = new Pattern("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Selenium_Practice_Sessions\\src\\test\\java\\Sikuli_FB_Email.PNG");
		s.wait(Email,2000);
		s.type(Email,"test@mail.com");
		
		Pattern Pass = new Pattern("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new\\Selenium_Practice_Sessions\\src\\test\\java\\Sikuli_FB_Pass.PNG");
		s.wait(Pass,2000);
		s.type(Pass,"1234567890");
		
	}

}
