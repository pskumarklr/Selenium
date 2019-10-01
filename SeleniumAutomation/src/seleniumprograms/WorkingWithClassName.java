package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithClassName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();  
		Thread.sleep(3000);
		driver.get("http://www.google.com");
		driver.findElement(By.className("gb_P")).click(); 
	}

}
