package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpathRelativePath {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement getRegister = driver.findElement(By.xpath("(//ul[1]/li[1]/a[1])[1]"));
		getRegister.click();
		Thread.sleep(2000);
		driver.close();
	}

}
