package seleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
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

		// click on Login button
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Select Mar content from Month dropdown
		Select dob_Month = new Select(driver.findElement(By.name("birthday_month")));
		dob_Month.selectByVisibleText("Mar");
		
		//new Select(driver.findElement(By.name("birthday_month"))).selectByVisibleText("Mar");
		
//		WebElement monthDD = driver.findElement(By.name("birthday_month"));
//		Select dob_Month1 = new Select(monthDD);
//		dob_Month1.selectByVisibleText("Mar");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("13");
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1974");
		
		
	}
}
