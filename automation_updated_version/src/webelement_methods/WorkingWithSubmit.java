package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("toys");

		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.submit();

		Thread.sleep(2000);
		driver.close();

	}
}