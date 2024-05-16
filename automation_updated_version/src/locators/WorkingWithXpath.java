package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement getRegister = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[1]/a"));
		getRegister.click();
		Thread.sleep(2000);
		
		WebElement getLogin = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a"));
		getLogin.click();
		Thread.sleep(2000);

		WebElement getShoppingCart = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[3]/a"));
		getShoppingCart.click();
		Thread.sleep(2000);
		WebElement getWishList = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[4]/a"));
		getWishList.click();
		Thread.sleep(2000);
		driver.close();
	}

}
