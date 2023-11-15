package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SampleXl {

	public static String numericData(int row, int cell) throws IOException {

		File loc = new File("D:\\Kani\\Automation Practice\\Project1\\src\\test\\resources\\testdata\\Demo.xlsx");

		FileInputStream input = new FileInputStream(loc);

		Workbook w = new XSSFWorkbook(input);

		Sheet s = w.getSheet("online");
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		double d = c.getNumericCellValue();
		long l = (long) d;
		String value = String.valueOf(l);
		return value;

	}

}
