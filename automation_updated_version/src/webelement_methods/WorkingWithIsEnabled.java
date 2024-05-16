package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Identifying the create button
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		if(createButton.isEnabled())
		{
			//System.out.println(createButton.isEnabled());
			createButton.click();
		}
		else
		{
			System.out.println("Create Account button is not enabled");
		}

		Thread.sleep(2000);
		driver.close();
		
	}
}
