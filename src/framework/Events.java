package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

/**
 * @author Akhilesh.Shukla
 *
 */
public class Events {

	WebDriver driver;

	public Events(WebDriver driver) {
		this.driver = driver;
	}

	public void enter(By by, String val) {
		driver.findElement(by).sendKeys(val);
	}

	public void click(By by) {
		driver.findElement(by).click();
	}

	public String getText(By by) {
		return driver.findElement(by).getText();
	}
	
	
	public void hoverOver(WebElement element){
		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
	
	
	
	//=============  Waits ======================//
	
	

	public WebElement waitForPresent(By by){
		WebDriverWait wait = new WebDriverWait(driver, 30);
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	
	/**
	 * @param by
	 * @param MenuOption
	 * select a menu option
	 */
	public void clickMenuListOption(By by,String MenuOption)
	{
		waitForPresent(by);
		System.out.println("==============  inside side menu -> events");
		List<WebElement> menuItems = driver.findElements(by);
	    for (WebElement menuItem : menuItems)
	    {
	    	System.out.println(menuItem.getText());
	        if (menuItem.getText().trim().equals(MenuOption))
	    		System.out.println("==============  inside side menu element matched");
	        	menuItem.click();
	    }
	}
	
}
