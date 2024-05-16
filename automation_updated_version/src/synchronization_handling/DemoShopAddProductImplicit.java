package synchronization_handling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoShopAddProductImplicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");

		// Login
		driver.findElement(By.className("ico-login")).click();

		// Enter Email and Password
		driver.findElement(By.id("Email")).sendKeys("SitaRam1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("234567");
		// login after entering credential
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).submit();
		//Thread.sleep(3000);

		//Selecting book product and adding to the cart
		driver.findElement(By.linkText("Books")).click();
		driver.findElement(By.xpath("//a[text()='Fiction']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']")).click();

		//Thread.sleep(5000);

		//Selecting the Computer Product and adding to the cart
		driver.findElement(By.linkText("Computers")).click();
		driver.findElement(By.linkText("Notebooks")).click();
		driver.findElement(By.xpath(
				"//a[text()='14.1-inch Laptop']/ancestor::div[@class='details']/descendant::input[@value='Add to cart']"))
		.click();
		
		// Clicking on Shopping Cart
				driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
				//Thread.sleep(2000);
				// clicking on agree button
				driver.findElement(By.id("termsofservice")).click();

				// clicking on checkout
				driver.findElement(By.id("checkout")).click();

				// clicking on continue button on billing address
				driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();

				//Thread.sleep(2000);
				// clicking on continue button on shipping address
				driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
				//Thread.sleep(2000);
				// clicking on option of shipping
				driver.findElement(By.id("shippingoption_0")).click();
				//Thread.sleep(2000);
				// clicking on continue button on shipping address
				driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
				
				//Thread.sleep(2000);
				// clicking on option of payment
				driver.findElement(By.id("paymentmethod_0")).click();
				
				//Thread.sleep(2000);
				// clicking on continue button on payment method
				driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
				//Thread.sleep(2000);
				// payment info
				driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();

				//Thread.sleep(2000);
				// confirm order
				driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
				//Thread.sleep(2000);
				String msg = driver.findElement(By.xpath("//strong[contains(text(),'successfully processed!')]")).getText();
				System.out.println("Message: "+msg);
				
				//Thread.sleep(2000);
				// order details
				driver.findElement(By.xpath("//a[contains(text(),'order details.')]")).click();
				
				//Thread.sleep(2000);
				//Log out
				driver.findElement(By.xpath("//a[text()='Log out']")).click();
				//Thread.sleep(2000);
				driver.close();

	}

}
