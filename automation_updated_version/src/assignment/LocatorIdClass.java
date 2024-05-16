package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIdClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui");	

		Thread.sleep(2000);
		
		WebElement enterNameField = driver.findElement(By.id("name"));
		enterNameField.sendKeys("Jhansi");	
		
		WebElement enterEmailField = driver.findElement(By.id("email"));
		enterEmailField.sendKeys("abc@gmail.com");

		WebElement enterPasswordField = driver.findElement(By.id("password"));
		enterPasswordField.sendKeys("Jh1234");		
		
		driver.findElement(By.className("bg-orange-500")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
