package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Retesting_FB {

	public static void main(String[] args) throws Exception {

		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("Retesting");

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		System.out.println(s.getLastRowNum());

		Row r1 = s.getRow(0);
		Cell res = r1.createCell(2);
		res.setCellValue("Results");

		String status;

		for (int i = 1; i <= s.getLastRowNum(); i++) {
			Row r = s.getRow(i);
			Cell un = r.getCell(0);
			Cell pwd = r.getCell(1);

			// Clear()
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(un.getStringCellValue());
			driver.findElement(By.name("pass")).clear();
			driver.findElement(By.name("pass")).sendKeys(pwd.getStringCellValue());
			driver.findElement(By.name("login")).click();
			Thread.sleep(6000);
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			// Verify given credentils are valid / in-valid
			// Validate the Error messages has displayed or not?
			// Size(): System will find the given locator, whether it has displayed on
			// Current Page?
			// If the locator has displayed on Screen then the SIZE = 1 else The SIZE =0

			if (driver.findElements(By.linkText("Find your account and log in.")).size() > 0
					|| driver.findElements(By.linkText("Forgot Password?")).size() > 0
					|| driver.findElements(By.linkText("Create a new Facebook account.")).size() > 0) {
				System.out.println("Given Credentials are invalid");
				status = "Fail";
			} else {
				System.out.println("Given Credentials are valid");
				status = "Pass";
			}

			Cell abc = r.createCell(2);
			abc.setCellValue(status);

//			 Forgot Password?
//			 Find your account and log in.
//			 Create a new Facebook account.

		} // for loop end
		FileOutputStream fo = new FileOutputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		wb.write(fo);
		wb.close();

	}

}
