package com.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UpdateXlSheet extends Base {
	@Test(dataProvider="loginData")
	private void tc1(String user, String pass) {
		browserLaunch("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	@DataProvider(name="loginData")
	public Object[][] login() {
		Object[][] data = new Object[2][2];
		
		data[0][0]="java";
		data[0][1]="41235";
		
		data[1][0]="selenium";
		data[1][1]="78945";
		return data;
	}
}
