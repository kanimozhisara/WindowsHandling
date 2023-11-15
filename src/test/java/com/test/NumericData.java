package com.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NumericData extends Base {
	@Test
	private void tc1() throws IOException {
		browserLaunch("\"https://www.facebook.com/\"");

		driver.findElement(By.id("email")).sendKeys();
		driver.findElement(By.id("pass")).sendKeys();

	}

	
}
