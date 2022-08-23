package seleniumBasics;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CollgeWeeklive {

	public static void main(String[] args) throws Exception {
		// Create webdriver object
		WebDriver driver;

		// Open Chrome Browser
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// To maximize the browser
		driver.manage().window().maximize();
		
	
		// URL
		driver.get("https://collegeweeklive.com/go-signup");
		
		//Page load
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.id("firstName")).sendKeys("poonam");
		driver.findElement(By.id("lastName")).sendKeys("baskota");
		driver.findElement(By.id("emailAddress")).sendKeys("pubaskota@gmail.com");
		driver.findElement(By.id("phoneNumber")).sendKeys("6822330306");
		driver.findElement(By.id("password")).sendKeys("java123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("java123");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Country of Citizenship
		
		/*
		 * WebElement citizenSelect = driver.findElement(By.id("country")); Select
		 * dropdown = new Select(citizenSelect);
		 * dropdown.selectByVisibleText("UNITED STATES");
		 * 
		 * //I am a WebElement iAm = driver.findElement(By.name("attendeeType")); Select
		 * iAmDropdown = new Select(iAm); iAmDropdown.selectByVisibleText("Parent");
		 * 
		 * // Anticipated Start Term WebElement StartTeam =
		 * driver.findElement(By.id("questions[q_134]")); Select StartDropdown = new
		 * Select(StartTeam); StartDropdown.selectByVisibleText("Fall 2022");
		 */
		
		
		driver.findElement(By.id("questions[q_135]")).click();
		driver.findElement(By.id("questions[q_136]")).click();
		driver.findElement(By.id("questions[q_137]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("submit")).click();
		
		//driver.quit();


	}

}
