package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickWithArgActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		//Click on UI
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		//Click on Button tab
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//Click on Right Button
		driver.findElement(By.xpath("//a[text()='Right Click']")).click();
		
		
		WebElement rightclickButton =driver.findElement(By.id("btn30"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(rightclickButton).perform();
		
		WebElement yesButton =driver.findElement(By.xpath("//div[text()='Yes']"));
		act.contextClick(yesButton).perform();
		yesButton.click();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
