package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethodVerification {
	public static void main(String[] args) {
		//To Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser window
		driver.manage().window().maximize();

		//To Launch the web application URL
		driver.get("https:/www.amazon.com/");

		//Use getTitle()
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals("Amazon.com. Spend less. Smile more."))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is incorrect");
		}

	}

}
