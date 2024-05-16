package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartProductListAndPriceByFindElements {	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//finding Search text field

		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("Laptop",Keys.ENTER);

		//Getting product list by findElements
		List<WebElement> productList = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		List<WebElement> productListPrice = driver.findElements(By.xpath("//div[@class='KzDlHZ']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));

		for(int i=0;i<productList.size();i++)
		{
			System.out.println(productList.get(i).getText()+" : "+productListPrice.get(i).getText());
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.close();

	}

}
