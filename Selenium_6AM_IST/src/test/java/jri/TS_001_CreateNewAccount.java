package jri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_001_CreateNewAccount {
	WebDriver driver;

	@Test
	public void TC_001() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");

	}

	@Test
	public void TC_002() {
		driver.findElement(By.id("signup-link9")).click();
		String expectedURL = "https://www.justrechargeit.com/SignUp.aspx";
		// Validate the current page URL
		if (driver.getCurrentUrl().equals(expectedURL)) {
			System.out.println("Create new account page has opened successfully");
		} else {
			System.out.println("Create new account page is not displayed");
		}
	}

	@Test
	public void TC_003() {
//		"1. Navigate to Create new Account  webpage
//		2. Click on Create Account button without fill any data
//		3. Check the Name error message"
//
//		"Application should display the validation message like below.
//		""Enter your name"""
		// Click on Create Account button without fill any data
		driver.findElement(By.name("imgbtnSubmit")).click();

		// Get the name error message by using GetText()
		String nameErrorMessage = driver.findElement(By.id("nameTD")).getText();
		System.out.println("Error message for Name attribute: " + nameErrorMessage);
		// Validate the nameErrorMessage
		if (nameErrorMessage.equals("Enter your name")) {
			System.out.println("Enter your name  error message is displayed");
		} else {
			System.out.println("Enter your name error message  is NOT displayed");
		}

	}

	@Test
	public void TC_004() {
		// Type Name test data
		driver.findElement(By.id("signup_name")).sendKeys("Test");
		driver.findElement(By.name("imgbtnSubmit")).click();
		// Validate the mobile ErrorMessage
		String mobileErrorMessage = driver.findElement(By.id("mobilenoTD")).getText();
		System.out.println("Error message for Name attribute: " + mobileErrorMessage);

		if (mobileErrorMessage.equals("Enter mobile no.")) {
			System.out.println("Enter mobile no.  error message is displayed");
		} else {
			System.out.println("Enter mobile no. error message  is NOT displayed");
		}
	}

	@Test
	public void TC_005() {

	}

}// Class End
