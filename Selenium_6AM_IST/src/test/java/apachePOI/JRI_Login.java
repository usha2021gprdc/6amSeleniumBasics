package apachePOI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

		//Get the test data from Excelsheet
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\JRI.xlsx");
		Workbook abc = new XSSFWorkbook(fi);
		Sheet s = abc.getSheet("Login");
		Row r = s.getRow(1);
		Cell url = r.getCell(0);
		Cell un = r.getCell(1);
		Cell pwd = r.getCell(2);

		
		
		//String passwordNumaric = pwd.getStringCellValue();
		double passwordNumaric = pwd.getNumericCellValue();
		//passwordNumaric is contains numbers only, want to push this number to password Editbox
		//Selenium Sendkeys() method should not allow numarics, its always String format
		//?
		//Convert double to String	
		String password = Double.toString(passwordNumaric);
		
		driver.get(url.getStringCellValue());
		driver.findElement(By.id("txtUserName")).sendKeys(un.getStringCellValue());
		driver.findElement(By.id("txtPasswd")).sendKeys(password);		
		//driver.findElement(By.id("imgbtnSignin")).click();
		

		
	}

}
