package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetAttributeAndGetTagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		
		System.out.println("TagName of the username webelement: "+username.getTagName());
		
		System.out.println("Value of the username ClassName: "+username.getAttribute("class"));
		Thread.sleep(2000);
		driver.close();    	
	} 
}
