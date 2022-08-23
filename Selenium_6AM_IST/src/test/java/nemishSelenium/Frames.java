package nemishSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
	WebDriver driver;

	@Test
	public void f() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://www.justrechargeit.com/");

		driver.get("https://testautomationpractice.blogspot.com/");
		//Switch to iFrame
		//driver.switchTo().frame(driver.findElement(By.id("frame-one1434677811")));
		driver.switchTo().frame(0);
//		  click on software testing tutorials
		driver.findElement(By.linkText("Software Testing Tutorials")).click();
		// Software Testing Tutorials
	}
}
