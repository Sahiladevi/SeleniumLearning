package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Identifying the create button
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		
		//getRect
		Rectangle rect = createButton.getRect();
		
		int height = rect.getHeight();
		System.out.println("Height: "+height);
		
		int width = rect.getWidth();
		System.out.println("Width: "+width);
		
		int x_axis = rect.getX();
		System.out.println("X-axis: "+x_axis);
		
		int y_axis = rect.getY();
		System.out.println("Y-axis: "+y_axis);
		
		Thread.sleep(2000);
		driver.close();
	}

}
