package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	@Test
	public void f() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		Thread.sleep(3000);
		// Click on CONTINUE TO LOGIN link
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);

		// Clicko n Login button
		driver.findElement(By.id("Button2")).click();
		Thread.sleep(3000);

		// Get the Alert message
		System.out.println(driver.switchTo().alert().getText());
		// Click on OK button on Alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);

		// Click on New User ? Register here/Activate link
		driver.findElement(By.linkText("New User ? Register here/Activate")).click();
		Thread.sleep(3000);

		// Get the Confirmation Alert message
		System.out.println(driver.switchTo().alert().getText());

		// Click on Cancle button on Confirmation alert window
		// driver.switchTo().alert().dismiss();
		// Click on Ok button on Confirmation alert window
		driver.switchTo().alert().accept();
	}
}
