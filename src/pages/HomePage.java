package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import framework.Events;

public class HomePage extends Events {

	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	By welcomeText = By.id("welcome");

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String value) {
		enter(username, value);
	}

	public void enterPassword(String value) {
		enter(password, value);
	}

	public void clickLogin() {
		click(login);
	}

	public void verifyWelcomeText() {
		String welcometxt = getText(welcomeText);
		Assert.assertEquals(welcometxt, "Welcome Admin");
	}

	public void selectTab(String tabName){
		
	}
	
}
