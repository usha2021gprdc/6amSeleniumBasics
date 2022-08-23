package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_Login {
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
		
		//Type UN & PWD
		driver.findElement(By.id("email")).sendKeys("Testgmail@test.sdfsd");
		driver.findElement(By.name("pass")).sendKeys("teasgt2q3243");
		
		//click on Login button
		driver.findElement(By.name("login")).click();
		
	}
}
