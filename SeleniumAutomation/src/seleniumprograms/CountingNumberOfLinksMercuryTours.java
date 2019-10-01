package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingNumberOfLinksMercuryTours {
	public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver(); 
	driver.get("http://newtours.demoaut.com");
	List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("the number of links is : " +links.size()); 

	}

}
