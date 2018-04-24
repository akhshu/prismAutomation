package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class LoginTest extends BaseTest {

	@Test(priority=1)
	public void verifylogin() {
		HomePage homepage = new HomePage(driver);
		homepage.enterUsername("super");
		homepage.enterPassword("prism2018");
		homepage.clickLogin();
		homepage.verifyWelcomeText();
	}

	@Test(priority=2)	
	public void verifyMenuSelection(){
		HomePage homepage = new HomePage(driver);
		homepage.selectSideMenuOption("Acquisitions");
		homepage.selectSideMenuOption("Contracts");
		homepage.selectSideMenuOption("Concessions");
		homepage.selectSideMenuOption("Certification");
		homepage.selectSideMenuOption("EEO/AA");
		homepage.selectSideMenuOption("Payrolls");
		homepage.selectSideMenuOption("Workforce");
		homepage.selectSideMenuOption("Reports");
		homepage.selectSideMenuOption("Configure");
		homepage.selectSideMenuOption("Vendors");
		
		
	}
	
	
}


