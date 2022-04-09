package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	@Before
	public static WebDriver init() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://techfios.com/test/101/");
		return driver;
		
	}
	
	@After
	public static void tearDown() {
		
		driver.close();
		driver.quit();
		
	}
	

	


}
