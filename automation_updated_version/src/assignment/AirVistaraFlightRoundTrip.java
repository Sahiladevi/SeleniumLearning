package assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirVistaraFlightRoundTrip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");
		
		Thread.sleep(2000);
		
		WebElement closeButton = driver.findElement(By.id("cookieModalCloseBtn"));
		closeButton.click();

		WebElement selectRoundTrip = driver.findElement(By.xpath("//input[@id='roundtrip']"));
		selectRoundTrip.click();
		
		Thread.sleep(2000);

		WebElement selectDeparture = driver.findElement(By.cssSelector("[name='flightSearchFrom']"));
		selectDeparture.sendKeys("DXB",Keys.ARROW_DOWN,Keys.TAB);

		WebElement selectArrival = driver.findElement(By.cssSelector("[name='flightSearchTo']"));
		selectArrival.sendKeys("MAA",Keys.ARROW_DOWN,Keys.TAB);

		Thread.sleep(2000);

		WebElement selectDepartDate = driver.findElement(By.cssSelector("input[id='departCalendar']"));
		selectDepartDate.click();
		
		Thread.sleep(2000);

		WebElement selectDepDate = driver.findElement(By.xpath("//a[text()='26']"));
		selectDepDate.click();

		WebElement selectRetDate = driver.findElement(By.xpath("//a[text()='29']"));
		selectRetDate.click();

		WebElement selectPassengers = driver.findElement(By.id("passengers"));
		selectPassengers.click();

		Thread.sleep(2000)	;	
		
		WebElement selectAdultCount = driver.findElement(By.id("adds_adult"));
		selectAdultCount.click();

		WebElement selectChildCount = driver.findElement(By.id("adds_child"));
		selectChildCount.click();

		WebElement classType = driver.findElement(By.xpath("//button[@value='premium-economy']"));
		classType.click();	
		
		Thread.sleep(2000);

		WebElement doneButton = driver.findElement(By.xpath("//button[contains(@class,'passengerModalBtn')]"));
		doneButton.click();		
		
		Thread.sleep(2000);

		WebElement searchFlightButton = driver.findElement(By.id("book-flight-widget"));
		searchFlightButton.click();		

//		Thread.sleep(2000);
//		driver.close();
	}


}
