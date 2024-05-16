package dropdown_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithFirstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		// identify the multi-select dropdown
		WebElement multiSelectDropdown = driver.findElement(By.id("select-multiple-native"));

		// create the object of select class
		Select s = new Select(multiSelectDropdown);
		
		//Selecting Options
		for (int i = 0; i <= 3; i++) {
			s.selectByIndex(i);	
			Thread.sleep(2000);			
		}
		
		//Getting text of first Selected option
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("First selected Option text: "+firstSelectedOption.getText());
		
		driver.close();
	}

}
