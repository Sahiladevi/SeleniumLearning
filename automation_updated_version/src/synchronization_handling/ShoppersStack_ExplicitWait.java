package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ShoppersStack_ExplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		WebElement product = driver.findElement(By.xpath("//span[text()='Levis Mens Regular Fit Tee']"));
		product.click();			
		driver.findElement(By.id("Check Delivery")).sendKeys("534678");
		WebElement check = driver.findElement(By.xpath("//button[text()='Check']"));
		
		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(check));
		
		check.click();
		
		driver.close();

}
}
