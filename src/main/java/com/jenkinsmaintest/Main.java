package com.jenkinsmaintest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) 
	{

		System.out.println("Hello World");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");

	}

}
