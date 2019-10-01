package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DefaultSelectedItem {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.wikipedia.org");
		Select lan = new Select(driver.findElement(By.id("searchLanguage"))); 
		WebElement e = lan.getFirstSelectedOption();
		if(e.getText().equals("English")) { 
			System.out.println("English is default selected");
		}

	}

}
