package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenHulu {
	
	public static void getHulu() throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();//to set up the browser, in this case browser is edge
		WebDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.get("https://www.hulu.com/");
		Thread.sleep(5000);
		driver.close();
		
	}

}
