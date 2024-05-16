package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSetPosition {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		Point p = new Point(100,200);
		driver.manage().window().setPosition(p);
	}
}
