package basicPrograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandile0 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
	
		driver.navigate().to("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		WebElement clickEliment =driver.findElement(By.id("button1"));
		for(int i =0 ; i<3;i++) {
			clickEliment.click();
			Thread.sleep(4000);
		}
		
		Set<String> allWindowHandiles = driver.getWindowHandles();
		
		for(String handile :allWindowHandiles ) {
			System.out.println("Window Handiles..>"+handile);
		}
		
	}

}
