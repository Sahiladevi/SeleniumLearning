package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		
		//Click on UI
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		
		//Click on Button tab
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		
		//Click on Double-click  Button
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		
		//Identifying yes button 
		
		WebElement yesButton = driver.findElement(By.id("btn20"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(yesButton).perform();
				
		act.doubleClick(driver.findElement(By.id("btn23"))).perform();
		
		act.doubleClick(driver.findElement(By.id("btn26"))).perform();
		
		driver.close();
				
		
	}

}
