package selenium.frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.softwaretestinghelp.com/");
		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("No of frames in this page are...."+numberOfTags);
		System.out.println("switching to frames");
		driver.switchTo().frame("aswift_0");
		System.out.println("Frame source"+driver.getPageSource());
		driver.switchTo().defaultContent();
		driver.close();
		
	}

}
