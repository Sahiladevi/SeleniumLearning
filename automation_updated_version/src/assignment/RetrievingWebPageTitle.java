package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrievingWebPageTitle 
{
	public static void main(String[] args) 
	{
		//To Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser window
		driver.manage().window().maximize();

		//To Launch the web application URL
		//driver.get("https:/www.google.com/");
		//driver.get("https://www.qspidersglobal.com/");
		//driver.get("https://www.shoppersstack.com/");
		driver.get("https://skillrary.com/");

		//Use getTitle()
		String title = driver.getTitle();
		System.out.println("Title of the web page: "+title);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		driver.close();	
	}

}
