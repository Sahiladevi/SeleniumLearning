package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		//Launch the web application by using navigate method.		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		//to go backward		
		driver.navigate().back();
		Thread.sleep(2000);
		//to go forward
		driver.navigate().forward();
		Thread.sleep(2000);
		//to refresh
		driver.navigate().refresh();
		//Close the browser
		driver.close();			
	}
}
