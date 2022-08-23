package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkSample {
	public static void main(String[] args) {

		// Create webdriver object
		WebDriver driver;
		// Open Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		// URL
		driver.get("https://www.facebook.com/");
		
		//Click on Forgot password? link
		//driver.findElement(By.linkText("Forgot password?")).click();
		driver.findElement(By.partialLinkText("For")).click();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.partialLinkText("ma")).click();

		
		
	}
}
