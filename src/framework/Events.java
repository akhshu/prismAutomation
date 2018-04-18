package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
	
}
