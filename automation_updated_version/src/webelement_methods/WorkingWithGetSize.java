package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Identifying the create button
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		
		//Fetch the size of the web element width and height
		Dimension sizeOfCreateButton = createButton.getSize();
		
		System.out.println("Size of Create account button: "+sizeOfCreateButton);
		
		//Fetch the location of web element x and y axis
		Point axis = createButton.getLocation();
		System.out.println("X and Y axis of Create account button: "+axis);
		Thread.sleep(2000);
		driver.close();
		
		
		//
	}

}
