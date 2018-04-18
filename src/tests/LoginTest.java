package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

	@Test
	public void verifylogin() {
		HomePage homepage = new HomePage(driver);
		homepage.enterUsername("Admin");
		homepage.enterPassword("admin");
		homepage.clickLogin();
		homepage.verifyWelcomeText();
	}

}
