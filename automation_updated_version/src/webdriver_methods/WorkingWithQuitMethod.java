package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuitMethod 
{
	public static void main(String[] args) {
		//To Launch the browser
		WebDriver driver = new ChromeDriver();

		//Maximize the browser window
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com");
		
		//open a window pop up
		driver.findElement(By.linkText("Open a popup window")).click();
		
		//close method
		//driver.close(); // It will close the parent window only not child one
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//quit method
		driver.quit();

	}

}
