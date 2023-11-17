package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTesting {
	
	public void getBrowser() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();		
//		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Zillow");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='gNO89b']")).click();
//		driver.close();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		BrowserTesting obj = new BrowserTesting();
		obj.getBrowser();
	}

}
