package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithDynamicXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		//Identify the search field
		WebElement searchTextField = driver.findElement(By.name("q"));
		//searchTextField.sendKeys("iphone",Keys.ENTER);
		searchTextField.sendKeys("iphone");
		Thread.sleep(2000);
		WebElement searchButton = driver.findElement(By.xpath("//button[@class='_2iLD__']"));
		searchButton.click();
		Thread.sleep(2000);
		

		WebElement productPrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 15 Plus (Pink, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		String iphonePrice =productPrice.getText();
		System.out.println(iphonePrice );
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
