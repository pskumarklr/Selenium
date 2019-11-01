package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorWithID {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		/*driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input#btnLogin")).click();*/
		driver.findElement(By.cssSelector("input[id=txtUsername]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[id=txtPassword]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input[id=btnLogin]")).click();
	}

}
