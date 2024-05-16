package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignActionsClass {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://magento.softwaretestingboard.com/");

		//Identifying the Gear element
		WebElement gearElement = driver.findElement(By.xpath("(//span[text()='Gear'])[1]"));
		//Identifying the watches element
		WebElement watchesElement = driver.findElement(By.xpath("(//span[text()='Watches'])[1]"));

		//Create Action class object to move over to contactus element
		Actions act = new Actions(driver);
		act.moveToElement(gearElement).click(watchesElement).perform();


		WebElement categoryElement = driver.findElement(By.xpath("//div[text()='Category']"));
		act.moveToElement(categoryElement).click().perform();

		WebElement electronicsElement = driver.findElement(By.xpath("//a[contains(@href,'/watches.html?category_gear=86')]"));
		act.moveToElement(electronicsElement).click().perform();

		WebElement thirdElement = driver.findElement(By.xpath("//strong[contains(@class,'item-name')]/a[contains(@href,'bolo-sport-watch.html')]"));
		act.moveToElement(thirdElement).click().perform();

		//verfying the product name

		String expectedPrdName = "Bolo Sport Watch";

		String actualPrdName = driver.findElement(By.xpath("//span[text()='Bolo Sport Watch']")).getText();

		if(actualPrdName.equals(expectedPrdName))
		{
			System.out.println("Product Name is as per the requirement");
		}
		else
		{
			System.out.println("Product Name is not as per the requirement");
		}

		double expectedPrdPrice = 49.0;

		String actualPrdPrice = driver.findElement(By.id("product-price-42")).getText();

		//System.out.println(actualPrdPrice);
		//double actPrice = Double.valueOf(priceString);

		String priceString =actualPrdPrice.substring(1);

		double actPrice = Double.parseDouble(priceString); 

		if(actPrice == expectedPrdPrice)
		{
			System.out.println("Product price is as per the requirement");
		}
		else
		{
			System.out.println("Product price is not as per the requirement");
		}
		WebElement qty = driver.findElement(By.id("qty"));
		qty.sendKeys(Keys.ARROW_UP,Keys.ARROW_UP);

		driver.findElement(By.id("product-addtocart-button")).click();

		//cart detail
		WebElement cart = driver.findElement(By.xpath("//span[@class='counter-number']"));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.moveToElement(cart).click().perform();
		//cart.click();

		//Clicking on view cart details
		driver.findElement(By.xpath("//span[text()='View and Edit Cart']")).click();
		
		//Verifying ordertotal value:
		String orderTotal = driver.findElement(By.xpath("//tr[@class='grand totals']//span[@class='price']")).getText();
		
		System.out.println(orderTotal);

		//To delete the product
		driver.findElement(By.xpath("//a[@class='action action-delete']")).click();

		driver.close();
	}

}
