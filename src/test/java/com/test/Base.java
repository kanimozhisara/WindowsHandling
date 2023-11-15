package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;

	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);

	}
	
	public String numericData(int row, int cell) throws IOException {
		File loc = new File("D:\\Kani\\Automation Practice\\Project1\\src\\test\\resources\\testdata\\Demo.xlsx");

		FileInputStream input = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(input);

		Sheet s = w.getSheet("online");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		String Value = c.getStringCellValue();
		double d = c.getNumericCellValue();
		long l = (long) d;
		String value = String.valueOf(l);
		return value;
		

	}

	public static void maximize() {
		// TODO Auto-generated method stub

	}

	public static void printUrl() {
		// TODO Auto-generated method stub

	}

	public static void getTitle() {
		// TODO Auto-generated method stub

	}

}
