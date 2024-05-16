package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/checkbox?sublist=0");
		
		Thread.sleep(2000);
		
		WebElement checkBox = driver.findElement(By.id("domain1"));
		
		if(checkBox.isSelected())
		{
			System.out.println("Check box is already selected");
		}
		else
		{
			System.out.println("Check box is not already selected");
			checkBox.click();
		}
		Thread.sleep(2000);
		driver.close();
	}

}
