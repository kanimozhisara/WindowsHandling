package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoSuggestion extends Base {
	
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("che");
		
		Thread.sleep(3000);
		List<WebElement> autoSuggstion = driver.findElements(By.xpath("//*[@class='G43f7e']//li"));
		int size = autoSuggstion.size();
		System.out.println(size);
		
		autoSuggstion.get(size-1).click();
		
		
		
		
	}
	
	

	
}
