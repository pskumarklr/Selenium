package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GetCoOrdinates {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		WebElement el = driver.findElement(By.linkText("Home")); 
		int x = el.getLocation().getX(); 
		int y = el.getLocation().getY(); 
	    
		// actions class usage starts here
		Actions as = new Actions(driver); 
		// move over element using its coordinates
		as.moveByOffset(x,y).perform(); 
		//driver.close();
		 }

}
