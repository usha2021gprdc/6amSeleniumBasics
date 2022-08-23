package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {
	public static void main(String[] args) throws Exception {

		// Create webdriver object
		WebDriver driver;

		// Open Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://www.facebook.com/");
		// Click on Forgot password? link
		driver.findElement(By.linkText("Forgot password?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Type somthing
		driver.findElement(By.id("identify_email")).sendKeys("Testgmail@test.sdfsd");
		
		driver.navigate().refresh();		
		Thread.sleep(5000);
		
		//Go back window
		driver.navigate().back();
		Thread.sleep(5000);
		
		//Go to next page by using Forward icon
		driver.navigate().forward();
		

	}
}
