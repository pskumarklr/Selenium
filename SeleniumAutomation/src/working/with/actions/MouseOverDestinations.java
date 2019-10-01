package working.with.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDestinations {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
        Actions as = new Actions(driver); 
        as.moveToElement(driver.findElement(By.linkText("Destinations"))).build().perform();
        Thread.sleep(3000);
        driver.close();
	}

}
