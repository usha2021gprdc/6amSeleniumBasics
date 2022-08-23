package nemishSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextVsGetAttribute {
	WebDriver driver;

	@Test
	public void f() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://collegeweeklive.com/go-signup/");

		
		//cLcik on submit button
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		String errorText = driver.findElement(By.id("questions_137Error")).getText();
		System.out.println(errorText);

	}
}
