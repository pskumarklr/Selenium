package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearMethodEditBoxes {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.name("userName")).sendKeys("enter user id");
		Thread.sleep(4000);
		// clear the default text and then enter the user id
		driver.findElement(By.name("userName")).clear();
        Thread.sleep(3000);
        driver.close(); 
	}

}
