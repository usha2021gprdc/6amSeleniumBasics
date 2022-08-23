package nemishSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com/");
		//click on Create new account button
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		//Dropdown handling
		Select dob_month = new Select(driver.findElement(By.id("month")));
		dob_month.selectByVisibleText("Oct");
		
		Select dobdate = new Select(driver.findElement(By.name("birthday_day")));
		dobdate.selectByVisibleText("15");
		
		Select dobYear = new Select(driver.findElement(By.id("year")));
		dobYear.selectByVisibleText("2013");

	}
}
