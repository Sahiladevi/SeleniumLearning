package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkartIphoneSearch {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//finding Search text field

		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("Laptop",Keys.ENTER);

		//Getting product list by findElements
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for(WebElement name : productList)
		{
			String productName = name.getText();
			String productPrice = driver.findElement(By.xpath("//div[text()='"+productName+"']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
			System.out.println(productName+"----------"+productPrice);
		}

	}


}
