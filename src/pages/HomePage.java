package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import framework.Events;

public class HomePage extends Events {

	By usernameBy = By.id("ucLogon_txtUserID");
	By passwordBy = By.id("ucLogon_txtPassword");
	By loginBy = By.id("ucLogon_btnLogon");
	By myaccountBy = By.id("ctl00_LMenu_hrMyAccount");
	
	By vendorsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[1]/a");
	By acquisitionsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[2]/a");
	By contractsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[3]/a");			
	By concessionsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[4]/a");
	By certificationBy = By.xpath("//*[@id='leftMenu']/div[4]/div[5]/a");
	By eeoBy = By.xpath("//*[@id='leftMenu']/div[4]/div[6]/a");
	By payrollsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[7]/a");
	By workForceBy = By.xpath("//*[@id='leftMenu']/div[4]/div[8]/a");
	By reportsBy = By.xpath("//*[@id='leftMenu']/div[4]/div[9]/a");
	By configureBy = By.xpath("//*[@id='leftMenu']/div[4]/div[10]/a");
	
//	By pageTitleBy = By.xpath("//*[@id='ctl00_titlemenu_lbl_level.*']");
	//*[starts-with(@id, ctl00_titlemenu_lbl_level')]
	By pageTitleBy = By.xpath("//*[starts-with(@id, 'ctl00_titlemenu_lbl_level')]");

	String pageTitle = null;	
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void enterUsername(String value) {
		waitForPresent(usernameBy);
		enter(usernameBy, value);
	}

	public void enterPassword(String value) {
		waitForPresent(passwordBy);
		enter(passwordBy, value);
	}

	public void clickLogin() {
		waitForPresent(loginBy);
		click(loginBy);
	}

	public void verifyWelcomeText() {
		waitForPresent(myaccountBy);
		String myaccounttext = getText(myaccountBy);
		Assert.assertEquals(myaccounttext, "My Account");
	}

	public void selectSideMenuOption(String menuOption) {
		switch (menuOption) {
		case "Vendors":
			System.out.println("select vendors");
			waitForPresent(vendorsBy);
			click(vendorsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "Contractor Menu");
			break;
		case "Acquisitions":
			waitForPresent(acquisitionsBy);
			click(acquisitionsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "My Procurements");
			break;
		case "Contracts":
			waitForPresent(contractsBy);
			click(contractsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "My Contracts");
			break;
		case "Concessions":
			waitForPresent(concessionsBy);
			click(concessionsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "Concession Menu");
			break;
		case "Certification":
			waitForPresent(certificationBy);
			click(certificationBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "Certification Menu");
			break;
		case "EEO/AA":
			waitForPresent(eeoBy);
			click(eeoBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "Affirmative Action Menu");
			break;
		case "Payrolls":
			waitForPresent(payrollsBy);
			click(payrollsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "List of Contracts");
			break;
		case "Workforce":
			waitForPresent(workForceBy);
			click(workForceBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "List of Contracts");
			break;
		case "Reports":
			waitForPresent(reportsBy);
			click(reportsBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "My Reports");
			break;
		case "Configure":
			waitForPresent(configureBy);
			click(configureBy);
			pageTitle = getText(pageTitleBy);
			Assert.assertEquals(pageTitle, "Configuration Menu");
			break;
		}

	}

}




