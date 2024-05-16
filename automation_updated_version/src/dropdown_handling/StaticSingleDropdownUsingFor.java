package dropdown_handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;


public class StaticSingleDropdownUsingFor {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		//ui link
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//drop down menu click
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		
		driver.findElement(By.xpath("//a[text()='Single Select']")).click();
		
		WebElement dropdown = driver.findElement(By.id("select3"));
		
		Select s = new Select(dropdown);
		
		System.out.println("Multiple-select dropdown or not: "+s.isMultiple());//false
	 
		//Single DropDown
		List<WebElement> allOptions = s.getOptions();
		//Using for each loop --> printing the text of all options in the dropdown
		for(WebElement option:allOptions){

			System.out.println(option.getText());
		}
		
		for (int i = 1; i <= 8; i++) {
			s.selectByIndex(i);	
			Thread.sleep(2000);			
		}
		
		//s.selectByIndex(2);
		
		//s.selectByValue("Poland");
		
//		s.selectByVisibleText("China");
//		WebElement dropdownState = driver.findElement(By.id("select5"));
//		Select s1 = new Select(dropdownState);
//		s1.selectByValue("Hong Kong");
		
		
		driver.close();
		
		
		
	}

}
