package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithId {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify the search text field and pass some products by using tagName
		WebElement searchTextField = driver.findElement(By.id("small-searchterms"));
		searchTextField.sendKeys("Books");
		
		Thread.sleep(2000);
		driver.close();				
	}
}
