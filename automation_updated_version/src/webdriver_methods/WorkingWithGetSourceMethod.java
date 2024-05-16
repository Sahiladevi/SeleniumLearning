package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSourceMethod {
	public static void main(String[] args) {
		//To Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser window
		driver.manage().window().maximize();

		//To Launch the web application URL
		driver.get("https://dealbrainer.com/");
		
		//fetch the source code
		String sourceCode = driver.getPageSource();
		System.out.println("Source Code: "+sourceCode);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		driver.close();	

	}

}
