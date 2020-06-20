package com.practice;

import org.testng.TestNG;

public class RunnableJarConfi {
	
	static TestNG testNg;

	public static void main(String[] args) {
		
		//process to generate jar file
		
			//1.create a config class
			//2.export the project by selecting the java > executable jar file and select config class file
		
		
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {CustomXpath.class});
		testNg.run();

	}

}
