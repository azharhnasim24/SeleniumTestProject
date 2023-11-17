package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenNetflix {
	
	public static void getNetflix() throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();//to set up the browser, in this case browser is firefox
		WebDriver driver = new FirefoxDriver();//this will open the browser
		Thread.sleep(5000);
		driver.manage().window().maximize();//this will maximize the browser
		driver.get("https://www.netflix.com/");//this will take us to netflix
		Thread.sleep(5000);
		driver.close();//this will close the browser
	}

}
