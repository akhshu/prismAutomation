package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import framework.PropertyManager;

public class BaseTest {

	WebDriver driver;

	@BeforeTest
	public void launchApp() {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		//String url = PropertyManager.getProperty("url");
		driver.get(PropertyManager.getProperty("url"));
	}

	@AfterTest
	public void closeApp() {
		driver.quit();
	}
	
}
