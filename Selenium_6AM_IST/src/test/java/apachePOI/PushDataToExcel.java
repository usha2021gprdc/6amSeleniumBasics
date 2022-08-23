package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PushDataToExcel {

	public static void main(String[] args) throws Exception {

		// Find the Workbook(Excel file)
		FileInputStream fi = new FileInputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("FaceBookTestData");
		
		
		
		Row r = s.getRow(0);
		Cell res = r.createCell(2);
		res.setCellValue("Results");

		Row r1 = s.getRow(1);
		Cell res1 = r1.createCell(2);
		res1.setCellValue("Fail");
		
		Sheet s1 = wb.getSheet("Retesting");
		Row r8 = s1.getRow(5);
		Cell abc = r8.createCell(2);
		abc.setCellValue("Poonam");
		
		FileOutputStream fo = new FileOutputStream(".\\src\\test\\resources\\testdata\\TD.xlsx");
		wb.write(fo);
		wb.close();
		

	}

}
