package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextSample {
	public static void main(String[] args) throws Exception {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Get the text from login page
		String abc = driver.findElement(By.className("_8eso")).getText();
		System.out.println(abc);

//		System.out.println("***************************");
//		
//		//Get the Google Search button label with GetText() method
//		driver.get("https://www.google.com/");
//		String gtext = driver.findElement(By.name("btnK")).getAttribute("value");
//		System.out.println(gtext);
//		
//		String gtext1 = driver.findElement(By.name("q")).getAttribute("value");
//		System.out.println("Default Value is: " +gtext1);
//		Thread.sleep(3000);
//		//PAss some text into Google search edit box4
//		driver.findElement(By.name("q")).sendKeys("Hello Selenium");
//		String gtext2 = driver.findElement(By.name("q")).getAttribute("value");
//		System.out.println("Default Value is: " +gtext2);
		
		
		
	}
}
