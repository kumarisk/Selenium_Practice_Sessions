package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class XpathTypes {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		
/*
 *	Syntax for XPath:
		 Xpath=//tagname[@attribute='value']
		 
	Types of X-path:
		There are two types of XPath:

				1) Absolute XPath
				2) Relative XPath	 
				
>>	Absolute XPath:
			It is the direct way to find the element, but the disadvantage of the absolute XPath is 
			that if there are any changes made in the path of the element then that XPath gets failed.
			
		Absolute XPath:
			/html/body/div[2]/div[1]/div/h4[1]/b/html[1]/body[1]/div[2]/div[1]/div[1]/h4[1]/b[1]
		 
		 
>>	Relative Xpath:
			Relative Xpath starts from the middle of HTML DOM structure. It starts with double 
			forward slash (//). It can search elements anywhere on the webpage, means no need to 
			write a long xpath and you can start from the middle of HTML DOM structure. Relative 
			Xpath is always preferred as it is not a complete path from the root element.	
			
		Relative XPath: 
			//div[@class='featured-box cloumnsize1']//h4[1]//b[1]	 
*/
		
		
//1) Basic XPath:
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("test1");
		
//2) Contains():
		
		driver.findElement(By.xpath("//input[contains(@text(),'login')]"));
		
//3) Using OR & AND:
		
		driver.findElement(By.xpath("//input[@name='loginbtn' or @text='loginbtn']"));
		driver.findElement(By.xpath("//input[@name='loginbtn' and @text='loginbtn']"));
		
//4) Xpath Starts-with:
		
		driver.findElement(By.xpath("//input[starts-with(@name='message')]"));
		
//5) XPath Text() Function:
		
		driver.findElement(By.xpath("//td[text()='UserID']"));
		
//6) XPath axes methods:
	//a) Following:
		
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//following::li"));
		
	//b) Ancestor:
		
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//ancestor::li"));
		
	//c) Child:
		
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//child::div"));
		
	//d) Preceding:	
		/*
			Select all nodes that come before the current node as shown in the below screen.
		 */
		driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']//preceding::div"));
		
	//e) Following-sibling:	
		/*
		 	Select the following siblings of the context node. Siblings are at the same level 
		 	of the current node as shown in the below screen. It will find the element after 
		 	the current node.
		 */
		driver.findElement(By.xpath(""));
		
	//f) Parent:
		/*
		 	Selects the parent of the current node as shown in the below screen.
		 */		
		driver.findElement(By.xpath(""));
		
	//	
		
		driver.findElement(By.xpath(""));
		
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		driver.findElement(By.xpath(""));
		
	}

}
