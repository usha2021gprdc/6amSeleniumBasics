package nemishSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalMethods {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com/");

		// click on Forgot password? link
		driver.findElement(By.linkText("Forgot password?")).click();
		
		//enter some text
		driver.findElement(By.id("identify_email")).sendKeys("sdgsdgsdgs");
		Thread.sleep(5000);
		
		//Click on Refresh icon
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		//Click on Back icon
		driver.navigate().back();
		Thread.sleep(5000);		
		
		//Click on Forward icon
		driver.navigate().forward();
		

	}
}
