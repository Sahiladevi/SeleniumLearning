package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod {
	public static void main(String[] args) {
		//To Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//To Launch the web application URL
		driver.get("https://qspidersglobal.com/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		driver.close();				
	}
}
