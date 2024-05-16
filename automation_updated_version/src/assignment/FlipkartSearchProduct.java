package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearchProduct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTextField = driver.findElement(By.cssSelector("[class='Pke_EE']"));
		searchTextField.sendKeys("Toys");
		
		WebElement searchButton = driver.findElement(By.cssSelector("[class='_2iLD__']"));
		searchButton.click();
		
		WebElement getCart = driver.findElement(By.cssSelector("[class='_3SkBxJ']"));
		getCart.click();
		
		Thread.sleep(2000);
		driver.close();
	}
}
