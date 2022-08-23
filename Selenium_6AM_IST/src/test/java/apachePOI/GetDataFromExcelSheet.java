package apachePOI;

import java.io.File;
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

public class GetDataFromExcelSheet {

	public static void main(String[] args) throws Exception {

		// Find the Workbook(Excel file)
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		// Find the Workbook
		Workbook wb = new XSSFWorkbook(fi);
		// Find the Sheet by name of sheet or index based
		Sheet s = wb.getSheet("FaceBookTestData");
		// Sheet s = wb.getSheetAt(0);
		// Find the ROW
		Row r = s.getRow(1);
		// Find the UserName
		Cell un = r.getCell(0);
		// Find the password
		Cell pwd = r.getCell(1);

		

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un.getStringCellValue());
		driver.findElement(By.name("pass")).sendKeys(pwd.getStringCellValue());
		//driver.findElement(By.name("login")).click();

	}

}
