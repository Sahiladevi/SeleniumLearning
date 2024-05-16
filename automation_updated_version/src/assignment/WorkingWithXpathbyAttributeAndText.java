package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathbyAttributeAndText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement createAccount = driver.findElement(By.xpath("//a[text()='Create new account']"));
		createAccount.click();
		Thread.sleep(2000);
		WebElement enterFirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		enterFirstName.sendKeys("Sita");
		WebElement enterLastName = driver.findElement(By.xpath("//input[@name='lastname']"));
		enterLastName.sendKeys("Ram");
		
		//WebElement enterMobileNumber = driver.findElement(By.xpath("//div[text()='Mobile number or email']"));
		WebElement enterMobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		enterMobileNumber.sendKeys("9876543210");
		
		WebElement enterPassword = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		enterPassword.sendKeys("Ram@123");		

		WebElement selectGender = driver.findElement(By.xpath("//input[@value='1']"));
		selectGender.click();
		
		WebElement clickSignUp = driver.findElement(By.xpath("//button[@name='websubmit']"));
		clickSignUp.click();
		
		Thread.sleep(2000);
		driver.close();
		}
	
	
	
}
