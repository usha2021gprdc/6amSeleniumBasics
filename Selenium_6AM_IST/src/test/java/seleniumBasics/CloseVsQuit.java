package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CloseVsQuit {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Thread.sleep(5000);
		
		//Click on Register button
		driver.findElement(By.xpath("//*[@id='register_Layer']/div")).click();
		
		Thread.sleep(5000);
		
		
		
		
		
		// Close the current browser window
		//driver.close();
		//Quit(): Close the current window as well as relative windows
		driver.quit();
		
		
		

	}
	
}
