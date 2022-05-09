package bootcamp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;



public class ReadExcel {
	WebDriver driver;
	

	@Test
	public void test() throws IOException,FileNotFoundException{
		String file = "./Book1.xlsx"; 
		FileInputStream fs = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fs);
		XSSFSheet sheet = book.getSheet("Sheet1");
		int lastrow = sheet.getLastRowNum();
		System.out.println(lastrow);
		for(int i=1; i<=lastrow; i++) {
			System.out.println("Name:" + sheet.getRow(i).getCell(0).getStringCellValue());
			System.out.println("SurName:" + sheet.getRow(i).getCell(1).getStringCellValue());
			System.out.println("Contact:" + sheet.getRow(i).getCell(2).getRawValue());
		}
		book.close();
	}
	

}