package working.with.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com"); 
		//store the webelement in a variable 
		WebElement el = driver.findElement(By.linkText("Download App"));
		Actions as = new Actions(driver); 
		as.contextClick(el).build().perform();

	}

}
