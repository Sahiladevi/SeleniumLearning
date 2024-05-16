package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AirvistaraBySnehal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");	
		
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.id("cookieModalCloseBtn"));
		closeButton.click();
		
		Thread.sleep(2000);
		
		WebElement roundtrip = driver.findElement(By.xpath("//input[contains(@id,'round')]"));
		roundtrip.click();
		
		WebElement selectDeparture = driver.findElement(By.xpath("//input[@aria-label = 'Search origin']"));
		selectDeparture.sendKeys("BOM");

		WebElement selectArrival = driver.findElement(By.xpath("//input[@aria-label = 'Search destination']"));
		selectArrival.sendKeys("MAA");
		
		Thread.sleep(2000);
		
		WebElement departDay = driver.findElement(By.xpath("//input[@id='departCalendar']"));
		departDay.click();
		
		Thread.sleep(2000);
		
		WebElement selectDepDate = driver.findElement(By.xpath("//a[@data-date='26']"));
		selectDepDate.click();
		
		WebElement selectRetDate = driver.findElement(By.xpath("//a[@data-date='29']"));
		selectRetDate.click();
		Thread.sleep(2000);
		WebElement searchFlightButton = driver.findElement(By.xpath("//button[@id='book-flight-widget']"));
		searchFlightButton.click();	

		
//		Thread.sleep(2000);
//		driver.close();

	}

}
