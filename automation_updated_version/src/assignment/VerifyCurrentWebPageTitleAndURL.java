package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCurrentWebPageTitleAndURL {
	public static void main(String[] args) {
		//To launch the Browser
		WebDriver driver = new ChromeDriver();
		
		//To launch the web application
		driver.get("https://www.qspidersglobal.com/");
		
		//Verify the title of current webpage
		String actualTitle = driver.getTitle();
		System.out.println("Actual title of the web page: "+actualTitle);
		if(actualTitle.equals("QSpiders Global - Software Training Institute"))
		{
			System.out.println("Title is matching");
		}
		else
		{
			System.out.println("Title is  not matching");
		}
		//Verify the url of current webpage
		
		String actual_url = driver.getCurrentUrl();
		
		System.out.println("Actual URL of the web page: "+ actual_url);
		
		if( actual_url.equals("https://www.qspidersglobal.com/"))
		{
			System.out.println("URL is matching");
		}
		else
		{
			System.out.println("URL is not matching");
		}
		
		driver.close();
	}	

}
