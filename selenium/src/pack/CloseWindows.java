package pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseWindows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentHandile= driver.getWindowHandle();
		System.out.println("Parent handile"+parentHandile);
		
		driver.manage().window().maximize();
		WebElement clickEliment =driver.findElement(By.id("button1"));
		
		for(int i=0; i<3; i++) {
			clickEliment.click();
			Thread.sleep(2000);
		}
		
		Set<String> allWindowHandiles = driver.getWindowHandles();
		String lastWindowHandile = driver.getWindowHandle();
		System.out.println("last Window"+lastWindowHandile);
		
		for(String handile :allWindowHandiles) {
			System.out.println("Show Window Handiles"+handile);
			System.out.println("Navigate to Google.com");
			driver.switchTo().window(handile);
			driver.get("http://www.google.com");
		}
		driver.switchTo().window(parentHandile);
		driver.close();
		
		driver.switchTo().window(lastWindowHandile);
		driver.get("http://www.gmail.com");
		
	}

}
