package window.handiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandiles1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.findElement(By.linkText("Basic Auth")).click();
		
		
		
	}

}
