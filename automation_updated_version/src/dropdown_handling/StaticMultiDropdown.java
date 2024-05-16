package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticMultiDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		//ui link
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//drop down menu click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Multi Select']")).click();
		
		WebElement multiDropdown = driver.findElement(By.id("select-multiple-native"));
		
		Select s = new Select(multiDropdown);
		s.selectByValue("Canada");
		s.selectByValue("Poland");
		s.selectByValue("India");
		//deselect
		s.deselectByValue("Poland");
		s.selectByVisibleText("United Kingdom");
		
		//s.deselectAll();
		
		driver.close();
		
	}
}
