package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperStack_ProductRemove {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");

		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("sahiladevi2003@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Devi@123");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.id("search")).sendKeys("iphone");
		driver.findElement(By.id("searchBtn")).click();

		WebElement itemPage = driver.findElement(By.xpath("//a[@href='/search-products/iphone']"));

		WebDriverWait  wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(itemPage));
		
		//WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'14 Pro')]/ancestor::div[contains(@class,'B8KN4')]/descendant::button[text()='add to cart']"));
		
		WebElement ele= driver.findElement(By.xpath("//span[contains(text(),'14 Pro')]"));
		
		WebDriverWait  wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.visibilityOf(ele));
		
     
		


	}	

}
