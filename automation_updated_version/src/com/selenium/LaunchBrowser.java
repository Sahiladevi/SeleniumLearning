package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser 
{
	public static void main(String[] args) 
	{
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();	
		//FirefoxDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		
		//Opening the URL
		driver.get("https://www.google.com");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.close();
	}
}
