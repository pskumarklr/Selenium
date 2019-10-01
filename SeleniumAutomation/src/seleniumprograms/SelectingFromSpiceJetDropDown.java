package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingFromSpiceJetDropDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		//creating an object for the drop down list 
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByIndex(4); 
		}

}
