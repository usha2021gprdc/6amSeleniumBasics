package nemishSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRIErrorMsg {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(3000);
		//Click on Create New account link
		//driver.findElement(By.id("signup-link9")).click();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		//cLcik on submit button
		driver.findElement(By.id("imgbtnSubmit")).click();
		Thread.sleep(3000);
		
		//Actual results: Selenium will go to application(frontEnd) get hte data with the help of GETTEXT method
		String actualResults = driver.findElement(By.id("nameTD")).getText();
		System.out.println(actualResults);

		String expectedresults = "Enter your name";
		
		//validate the error message
		if (expectedresults.equals(actualResults)) {
			System.out.println("Both are matching");
		} else {
			System.out.println("Both are NOT matching");
		}
	}
}
