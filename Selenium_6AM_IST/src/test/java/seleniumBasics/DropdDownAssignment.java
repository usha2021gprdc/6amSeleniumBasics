package seleniumBasics;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdDownAssignment {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		new Select(driver.findElement(By.name("speed"))).selectByVisibleText("Fast");
		new Select(driver.findElement(By.name("files"))).selectByVisibleText("PDF file");
		new Select(driver.findElement(By.name("number"))).selectByVisibleText("4");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		new Select(driver.findElement(By.name("products"))).selectByVisibleText("Bing");
		new Select(driver.findElement(By.name("animals"))).selectByVisibleText("Baby Cat");
	}
}
