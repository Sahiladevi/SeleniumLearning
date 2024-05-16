package webdriver_methods;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
//import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithManageMethod {
	public static void main(String[] args) {
		//To Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the browser window
//		Options opt= driver.manage();
//		Window win = opt.window();
//		win.maximize();
		
		driver.manage().window().maximize();

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
