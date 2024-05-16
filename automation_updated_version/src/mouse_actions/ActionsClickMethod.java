package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qspidersglobal.com/learn/");

		//Identifying the more element
		WebElement moreElement = driver.findElement(By.xpath("//a[text()='More']"));

		//Identifying the requirements element
		WebElement reqElement = driver.findElement(By.xpath("(//a[text()='Requirements'])[1]"));

		//Create Action class object to move over to more element and clicking on requirements element
		Actions act = new Actions(driver);
		act.moveToElement(moreElement).click(reqElement).perform();
		
		driver.close();
	}

}
