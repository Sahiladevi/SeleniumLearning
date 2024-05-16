package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRegister {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement clickRegister = driver.findElement(By.cssSelector("[class='ico-register']"));
		clickRegister.click();
		
		WebElement getGender = driver.findElement(By.cssSelector("[id='gender-female']"));
		getGender.click();
		
		WebElement getFirstName = driver.findElement(By.cssSelector("[id='FirstName']"));
		getFirstName.sendKeys("Ram");
		
		WebElement getLastName = driver.findElement(By.cssSelector("[id='LastName']"));
		getLastName.sendKeys("Sita");
		
		WebElement getEmail = driver.findElement(By.cssSelector("[id='Email']"));
		getEmail.sendKeys("SitaRam1234@gmail.com");
		
		WebElement getPassword= driver.findElement(By.cssSelector("[id='Password']"));
		getPassword.sendKeys("234567");
		
		WebElement getConfirmPassword = driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
		getConfirmPassword.sendKeys("234567");
		

		WebElement registerButton = driver.findElement(By.cssSelector("[id='register-button']"));
		registerButton.click();		
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
