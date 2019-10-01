package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingNumberOfFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://code.makery.ch/library/dart-drag-and-drop/");
        driver.manage().window().maximize(); 
        int number = driver.findElements(By.tagName("iframe")).size(); 
        System.out.println(number);

	}

}
