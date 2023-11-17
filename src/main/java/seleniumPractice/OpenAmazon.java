package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenAmazon {
	
	public void getAmazon() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(6000);
		driver.close();
		
	}

}
