package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	
	public static void getGoogle() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();//set up for chromedriver browser
		WebDriver driver = new ChromeDriver();//open the chrome browser
		Thread.sleep(5000);
		driver.manage().window().maximize();//maximize the chromebrowser
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");//open the google search engine
		Thread.sleep(5000);
		driver.close(); //close the browser
	}

}
