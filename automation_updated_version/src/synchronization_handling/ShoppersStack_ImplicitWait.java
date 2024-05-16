package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppersStack_ImplicitWait {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		
		WebElement product = driver.findElement(By.xpath("//span[text()='Levis Mens Regular Fit Tee']"));
		product.click();
		
		//driver.close();
		
		driver.findElement(By.id("Check Delivery")).sendKeys("534678");
		WebElement check = driver.findElement(By.xpath("//button[text()='Check']"));
		if(check.isEnabled())
		{
			System.out.println("Already enabled");
		}
		else
		{
			System.out.println("Not enabled");
			check.submit();	
			//check.click();
		}
		
		
		
	}

}
