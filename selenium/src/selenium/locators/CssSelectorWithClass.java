package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorWithClass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.cssSelector("input.textInputContainer")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input.textInputContainer")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();

	}

}
