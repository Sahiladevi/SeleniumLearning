package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Expedia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.expedia.com/");	

		Thread.sleep(2000);		
		WebElement selectFlights = driver.findElement(By.xpath("//span[text()='Flights']"));
		selectFlights.click();				

		Thread.sleep(2000);
		WebElement oneWayTrip= driver.findElement(By.xpath("//span[text()='One-way']"));
		oneWayTrip.click();

		Thread.sleep(2000);
		WebElement cabinClassButton= driver.findElement(By.xpath("//button[@id='cabin_class']"));
		cabinClassButton.click();

		Thread.sleep(2000);

		WebElement cabinClass= driver.findElement(By.xpath("//span[text()='Business class']"));
		cabinClass.click();

		Thread.sleep(2000);
		WebElement leavingFrom= driver.findElement(By.xpath("//button[@aria-label='Leaving from']"));
		leavingFrom.click();

		WebElement origin= driver.findElement(By.xpath("//input[@id='origin_select']"));
		origin.sendKeys("Chennai (MAA - Chennai Intl.) India",Keys.ENTER);
		
		WebElement goingTo= driver.findElement(By.xpath("//button[@aria-label='Going to']"));
		goingTo.click();

		WebElement destination= driver.findElement(By.xpath("//input[@id='destination_select']"));
		destination.sendKeys("Amsterdam (AMS - Schiphol) Netherlands,Keys.ENTER");
		
		WebElement date= driver.findElement(By.xpath("//button[@aria-label='Date, May 7']"));
		date.click();
		Thread.sleep(2000);
		WebElement nextNavigateMonth= driver.findElement(By.xpath("//button[contains(@class, 'uitk-button-medium uitk-button-only-icon uitk-button-paging')]/ancestor::div[contains(@class,'uitk-cal-controls-button-next')]"));
		nextNavigateMonth.click();
		Thread.sleep(5000);
		WebElement travelDate= driver.findElement(By.xpath("//div[text()='10']/ancestor::div[contains(@class,'uitk-day-selectable uitk-day-clickable')]/descendant::div[@aria-label='Monday, June 10, 2024']"));
		travelDate.click();


		Thread.sleep(2000);
		driver.close();




	}

}
