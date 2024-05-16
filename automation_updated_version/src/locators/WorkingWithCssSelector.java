package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCssSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
//		Identify the search text field and pass some products by using tagName
//		WebElement searchTextField = driver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']"));
//		WebElement searchTextField = driver.findElement(By.cssSelector("input[id^='sm']"));
//		WebElement searchTextField = driver.findElement(By.cssSelector("input[id*='hterms']"));
		WebElement searchTextField = driver.findElement(By.cssSelector("input[id$='rms']"));
		
		searchTextField.sendKeys("Mobile");
		
		Thread.sleep(2000);
		driver.close();
	}

}
