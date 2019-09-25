package selenium.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCSSselector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.one.com/mail/");
		driver.findElement(By.className("username")).sendKeys("santoshkumar@swankinnovation.com");
		driver.findElement(By.className("password")).sendKeys("swank@123");
		driver.findElement(By.className("oneButton")).click();
	}

}
