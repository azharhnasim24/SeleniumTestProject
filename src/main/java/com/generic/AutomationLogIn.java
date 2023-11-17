package com.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationLogIn {
	
	public void getLogIn() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://automationexercise.com/");
		driver.manage().window().maximize();
		
		MasterPageFactory mpf = new MasterPageFactory(driver);
		mpf.getLoginBtnHome().click();
		mpf.getEmailfield().sendKeys("mahmasim24@gmail.com");
		mpf.getPasswordfield().sendKeys("mahMasim123");
		mpf.getLoginBtn2().click();
		
		driver.findElement(By.xpath("//*[@class='fa fa-lock']")).click();
		driver.findElement(By.xpath("(//*[@name='email'])[1]")).sendKeys("mahmasim24@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("mahMasim123");
//		driver.findElement(By.xpath("(//*[@class='btn btn-default'])[1]")).click();
//		driver.findElement(By.xpath("//*[text()='Login']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
	}

}
