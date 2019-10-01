package working.with.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class InspectingAnElementUsingActions {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		WebElement el = driver.findElement(By.linkText("REGISTER"));
		Actions as = new Actions(driver); 
		as.contextClick(el).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).sendKeys(Keys.ENTER)
		.build().perform();
        
	}

}
