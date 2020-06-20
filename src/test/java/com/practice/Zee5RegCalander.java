package com.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zee5RegCalander {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.gecko.driver", "E:\\automation extenstions\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(75, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.zee5.com/");
		
		String date = "15-June-1995";
		String dateArr[]  = date.split("-");
		String day = dateArr[0];
			System.out.println(day);
		String month = dateArr[1];
			System.out.println(month);
		String year = dateArr[2];
			System.out.println(year);
		String yearsgroup = "1991 – 2000";	
		
		driver.findElement(By.xpath("//div[text()='Sign up for FREE']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//*[@class='noSelect iconInitialLoad-ic_calendar dateIcon']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
//		String llist = driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).getText();
//		System.out.println(llist);
	
		
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	
	//display montha									
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	//display years	
		driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	//click on the left arrow to get years group	
		driver.findElement(By.xpath("//button[@class=\"react-calendar__navigation__arrow react-calendar__navigation__prev-button\"]")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		
		
		//range years			
				List <WebElement> List = driver.findElements(By.xpath("//div[@class='react-calendar__century-view__decades']//button"));
				System.out.println(List.size());
				List.size();
				for (WebElement webElement : List) {
		            String name = webElement.getText();
		            //System.out.println("years fron range" + name); 
		            if(webElement.getText().equals(yearsgroup)) {
		            	webElement.click();
		            	break;
		            }
		            
		        }
		
		
		
	//years	
		List <WebElement> yearList = driver.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']//button"));
		System.out.println(yearList.size());
		yearList.size();
		for (WebElement webElement : yearList) {
            String name = webElement.getText();
            //System.out.println("list of years" + name);
            if(webElement.getText().equals(year)) {
            	webElement.click();
            	break;
            }
        }
		
		
		//months	
				List <WebElement> monthList = driver.findElements(By.xpath("//div[@class='react-calendar__viewContainer']//button"));
				System.out.println(monthList.size());
				monthList.size();
				for (WebElement webElement : monthList) {
		            String name = webElement.getText();
		           // System.out.println("list of months" + name);
		            if(webElement.getText().equals(month)) {
		            	webElement.click();
		            	break;
		            }
		        }
				
				
				//days	
				List <WebElement> daysList = driver.findElements(By.xpath("//div[@class='react-calendar__month-view__days']//button"));
				System.out.println(daysList.size());
				daysList.size();
				for (WebElement webElement : daysList) {
		            String name = webElement.getText();
		           // System.out.println("no of days" + name);
		            if(webElement.getText().equals(day)) {
		            	webElement.click();
		            	break;
		            }
		        }
		
		
		
		
	
		
		/*
		List<WebElement> choice = driver.findElements(By.xpath("//div[@class='atcui-scrollPanel-wrapper']/ul/li"));
        for(WebElement e : choice){
            System.out.println(e.getText());
            if(e.getText().equals(option)){
                e.click();
                break;
            }*/
		
		
/*		Select sel1 = new Select(driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")));
		sel1.selectByVisibleText(month);
		
		
		String datr =null;
		
		for(int i=0; i<=List.size(); i++) {
			
			datr = driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']//button")).getText();
			if(datr.equals(year)) {
				
			}
		}

		
		driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']//button[text()='2001']")).click();
		
		
		
				
		Select sel = new Select(driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']")));
		sel.selectByValue(year);		
		
		driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']")).sendKeys(year);
		Select sel1 = new Select(driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']")));
		sel1.selectByVisibleText(month);*/
		
		
		
		
	}
	}


