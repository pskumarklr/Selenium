package selenium.locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorTagName {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.wikipedia.org/");
		List<WebElement> allLinks = driver.findElements(By.tagName("s"));
		System.out.println("Links count is: "+allLinks.size());
		
		//driver.close();

	}

}
