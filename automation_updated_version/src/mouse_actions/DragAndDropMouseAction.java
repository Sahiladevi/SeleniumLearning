package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMouseAction {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");

		//Click on UI
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();

		//Click on mouse action tab
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();

		//Click on drag and drop tab
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();

		//Click on drag position
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();

		//Identifying drag position of the element
		WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		
		WebElement drag1 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));

		//Identifying drop position of the element
		WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));

		//Creating obj of action class to perform dag and drop action
		Actions act = new Actions(driver);

		act.dragAndDrop(drag, drop).perform();
		act.dragAndDrop(drag1, drop).perform();

		//Identifying drag position of the element
		WebElement dragLaptop = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement dragLaptop1 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));


		//Identifying drop position of the element
		WebElement dropLaptop = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		
		act.dragAndDrop(dragLaptop, dropLaptop).perform();
		act.dragAndDrop(dragLaptop1, dropLaptop).perform();
	}

}
