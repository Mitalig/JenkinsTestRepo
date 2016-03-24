package com.jenkinstest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JenkinsRunTest {

	
	public static void seleniumtest() 
	{

		System.out.println("Hello Ashwin");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
	}

}
