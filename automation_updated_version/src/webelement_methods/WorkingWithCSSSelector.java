package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCSSSelector {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		//Identifying the create button
		WebElement createButton = driver.findElement(By.linkText("Create new account"));
		
		String colorButton = createButton.getCssValue("color");		
		System.out.println("Color of the create account button: "+colorButton);
		
		String fontButton = createButton.getCssValue("font-size");
		
		System.out.println("Font-size "
				+ "of the create account button: "+fontButton);		
		
		Thread.sleep(2000);
		driver.close();
	}

}
