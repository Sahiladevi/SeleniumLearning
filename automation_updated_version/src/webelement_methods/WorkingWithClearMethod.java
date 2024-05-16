package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		//finding Search text field

		WebElement searchTextField = driver.findElement(By.name("q"));
		
		//Pass the Value
		searchTextField.sendKeys("Iphone");
		
		Thread.sleep(2000);
		
		//Clear the value
		
		searchTextField.clear();		
		
		searchTextField.sendKeys("Laptop",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.close();			
		
	}
}
