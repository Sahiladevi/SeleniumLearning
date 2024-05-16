package dropdown_handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetAllSelectedOptions {
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
		
		List<WebElement> selectedOptions =s.getAllSelectedOptions();
		//Using for each loop --> printing the text of selected options in the dropdown
		System.out.println("--------------------Using for each loop--------------------------------");
		for(WebElement option:selectedOptions){

			System.out.println(option.getText());
		}
		System.out.println("--------------------Using for loop--------------------------------");
		for (int i = 0; i < selectedOptions.size(); i++) {
			System.out.println(selectedOptions.get(i).getText());
		}
		driver.close();

	}
}
