package seleniumBasics;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JRI_Login {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		driver.findElement(By.id("txtUserName")).sendKeys("cnu4mca@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("123456");
		
		//Use scanner to enter captcha value manually
		Scanner s = new Scanner(System.in);
		System.out.println("Hey User, Please type Captcha Number here then click on Enter key");
		System.out.println("*******************************************");
		
		String captcha = s.next();
		
		//Thread.sleep(6000);
		
		driver.findElement(By.name("txtCaptcha")).sendKeys(captcha);
		driver.findElement(By.id("imgbtnSignin")).click();
		

	}

}
