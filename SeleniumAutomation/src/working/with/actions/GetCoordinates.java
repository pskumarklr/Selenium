package working.with.actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class GetCoordinates {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		WebElement el = driver.findElement(By.linkText("Home")); 
		int x = el.getLocation().getX(); 
		int y = el.getLocation().getY(); 
	    
		// actions class usage starts here
		Actions as = new Actions(driver); 
		// move over element using its coordinates
		as.moveByOffset(x,y).perform(); 
		driver.close();
		
		
	}

}
