package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.amazon.in/");
		
		Actions as = new Actions(driver);
		as.moveToElement(driver.findElement(By.linkText("Best Sellers"))).build().perform();
		String t = driver.getTitle();
		System.out.println(t);
		driver.close();
	}

}
