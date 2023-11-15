package com.test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String> allWindowId = driver.getWindowHandles();
		System.out.println(allWindowId);
		
		for (String s : allWindowId) {
			if (!s.equals(parentWindow)) {
				driver.switchTo().window(s);
				
				Thread.sleep(3000);
				
				driver.findElement(By.id("firstName")).sendKeys("BesantOnline");
				
				Thread.sleep(4000);
				
				driver.close();
			}
			
			driver.switchTo().parentFrame();
			driver.findElement(By.id("name")).sendKeys("kanimozhi");
			
			
		}
	}

}
