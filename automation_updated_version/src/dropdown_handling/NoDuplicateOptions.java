package dropdown_handling;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDuplicateOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("C:\\Users\\sahil\\Documents\\QSPGL-AT-113\\HTML_Workspace\\HLML_113\\remove_duplicate_options.html");
		
		WebElement selectElement =driver.findElement(By.name("select"));
		Select s = new Select(selectElement);
		
		List<WebElement> allOptions = s.getOptions();
		
		TreeSet<String> optionSet = new TreeSet<String>();
		
		for (int i = 0; i < allOptions.size(); i++) {
			String value = allOptions.get(i).getText();
			optionSet.add(value);		
		}
		
		for(String opt: optionSet) {
			System.out.println(opt);
		}
		driver.close();
		
	}

}
