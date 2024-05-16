package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateUserInActiTime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=2numj1gjdtiuj");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("admin");
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		WebElement users = driver.findElement(By.xpath("//a[@class='content users']"));
		users.click();
		
		WebElement createUser = driver.findElement(By.xpath("//input[@value='Create New User']"));
		createUser.click();
		
		driver.findElement(By.name("username")).sendKeys("yamuma");
		driver.findElement(By.name("passwordText")).sendKeys("sita@123");
		driver.findElement(By.xpath("//option[text()='enabled']")).click();
		driver.findElement(By.name("passwordTextRetype")).sendKeys("sita@123");
		driver.findElement(By.name("firstName")).sendKeys("Yamuna");
		driver.findElement(By.name("lastName")).sendKeys("Radhai");	
		
		WebElement workduration = driver.findElement(By.name("workdayDurationStr"));
		workduration.clear();
		Thread.sleep(2000);
		workduration.sendKeys("9:00");
		
		driver.findElement(By.name("overtimeTracking")).click();
		driver.findElement(By.id("right2")).click();
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).submit();

	}

}
