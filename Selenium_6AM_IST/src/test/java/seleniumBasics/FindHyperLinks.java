package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindHyperLinks {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");

		List<WebElement> hyperLinks = driver.findElements(By.tagName("a"));
		System.out.println(hyperLinks.size());

		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(6000);
		List<WebElement> dropdowns = driver.findElements(By.tagName("select"));
		System.out.println(dropdowns.size());

	}

}
