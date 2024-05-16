package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMouseAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");

		//Click on UI
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		//Click on mouse action tab
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

		//Click on click and hold tab
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		
		//click and hold on circle element
		
		WebElement circle = driver.findElement(By.id("circle"));
		
		//Creating the obj of Actions class to perform click and hold action on circle
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(circle).perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		act.release(circle).perform();
		


	}

}
