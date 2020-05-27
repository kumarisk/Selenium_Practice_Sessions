package com.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadPropertiesFile {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
	//creating object to the properties class	
		Properties prop = new Properties();
		
	//creating object to fileinputstream class(intraction between the code an the file)	
		FileInputStream ip = new FileInputStream("C:\\Users\\sudheer.indlamudi\\eclipse-workspace-new"
				+ "\\Selenium_Sessions\\src\\test\\java\\com\\practice\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		String age = prop.getProperty("age");
		
		System.out.println(age);
		
		String url = prop.getProperty("URL");
		
		String browsername = prop.getProperty("browser");
		
		System.out.println(browsername);
		
		if(browsername.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudheer.indlamudi\\git\\jalesh_web\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\sudheer.indlamudi\\git\\jalesh_web\\drivers\\IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
		else if(browsername.equals("ME")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\sudheer.indlamudi\\git\\jalesh_web\\drivers\\MicrosoftWebDriver.exe");
	    	driver = new EdgeDriver();
		}
		else if(browsername.equals("Safari")) {
			driver = new SafariDriver();
		}
		else {
			System.out.println("Enter correct browser name");
		}
		
		driver.get(url);
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.findElement(By.name(prop.getProperty("firstname_name"))).sendKeys(prop.getProperty("firstname"));
		
		driver.findElement(By.name(prop.getProperty("surname_name"))).sendKeys(prop.getProperty("surname"));
		
		driver.findElement(By.name(prop.getProperty("email_name"))).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.id(prop.getProperty("password_id"))).sendKeys(prop.getProperty("password"));

		

	}

}
