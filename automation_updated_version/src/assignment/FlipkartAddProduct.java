package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddProduct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement searchTextField = driver.findElement(By.cssSelector("[class='Pke_EE']"));
		searchTextField.sendKeys("Toys");
		
		WebElement searchButton = driver.findElement(By.cssSelector("[class='_2iLD__']"));
		searchButton.click();
		
		WebElement clickOnProduct = driver.findElement(By.xpath("//a[text()='K A Enterprises 4 pack Monster truck cars,push and go t...']"));
		clickOnProduct.click();
		
		Thread.sleep(2000);
		
		WebElement addToCart = driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']"));
		//WebElement addToCart = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		addToCart.click();
	
		Thread.sleep(2000);
		driver.close();
	}
}
