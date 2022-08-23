package apachePOI;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Toyota {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://forms-uat.toyotabeta.co.uk/brochure");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on Title 
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Click on Title optional value
		driver.findElement(By.xpath("//*[@id='order_brochure']/div/form/div[7]/div[1]/div[3]/div/div/ul/li[6]/a")).click();
		
		
		//a[@class='dropdown-toggle  ']
		
		
		
	}

}
