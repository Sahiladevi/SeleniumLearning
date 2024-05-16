package assignment;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AirvistaraByXpathLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/");			
		
		WebElement closeButton = driver.findElement(By.xpath("//button[@id='acceptAllBtn']"));
		closeButton.click();

		WebElement selectOneWay = driver.findElement(By.xpath("//input[@id='onewaytrip']"));
		selectOneWay.click();

		WebElement selectDeparture = driver.findElement(By.xpath("//input[@name='flightSearchFrom']"));
		selectDeparture.sendKeys("PNQ",Keys.ARROW_DOWN,Keys.TAB);

		WebElement selectArrival = driver.findElement(By.xpath("//input[@name='flightSearchTo']"));
		selectArrival.sendKeys("MAA",Keys.ARROW_DOWN,Keys.TAB);

		WebElement departDay = driver.findElement(By.xpath("//input[@id='departCalendar']"));
		departDay.click();

		Thread.sleep(2000);

		WebElement departMonth= driver.findElement(By.xpath("//div[@monthname='May']"));
		departMonth.click();

		WebElement departDate = driver.findElement(By.xpath("//a[text()='27']"));
		departDate.click();			

		WebElement selectPassengers = driver.findElement(By.xpath("//input[@id='passengers']"));
		selectPassengers.click();

		Thread.sleep(2000);				

		//		System.out.println("Enter number of adult seats: ");
		//		Scanner scan = new Scanner(System.in);
		//		int adultCount = scan.nextInt();
		
		WebElement selectAdult = driver.findElement(By.xpath("//button[@id='adds_adult']"));

		for(int i=0; i<3; i++)
		{

			selectAdult.click();
		}

		WebElement classType = driver.findElement(By.xpath("//button[text()='Business']"));
		classType.click();	

		WebElement doneButton = driver.findElement(By.xpath("//button[contains(@class,'passengerModalBtn') and text()='Done']"));
		doneButton.click();		
		
		Thread.sleep(2000);

		WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search Flights']"));
		searchButton.click();		
		

		Thread.sleep(2000);
		driver.close();
	}
}
