package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNameLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		
		//Fetching the username using name locator
		WebElement enterName = driver.findElement(By.name("username"));
		enterName.sendKeys("9867895901");
		
		WebElement enterPassword = driver.findElement(By.name("password"));
		enterPassword.sendKeys("456781");
		
		Thread.sleep(2000);
		WebElement clickLogin= driver.findElement(By.className("_acap"));
		clickLogin.click();
		Thread.sleep(2000);
		driver.close();
		
	}

}
