package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickOnRadioButton {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB");
		
		driver.findElement(By.cssSelector("#u_0_7")).click();
	}

}
