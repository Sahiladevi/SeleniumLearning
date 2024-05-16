package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://qspidersglobal.com/learn/");

		//Identifying the more element
		WebElement moreElement = driver.findElement(By.xpath("//a[text()='More']"));

		//Create Action class object to move over to more element
		Actions act = new Actions(driver);
		act.moveToElement(moreElement).perform();

		//Identifying the more element
		WebElement contactUsElement = driver.findElement(By.xpath("//a[text()='Contact Us']"));

		//Create Action class object to move over to contactus element

		act.moveToElement(contactUsElement).perform();
		contactUsElement.click();
		
		driver.close();
	}

}
