package selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		String CurrentURL = driver.getCurrentUrl();
		System.out.println(CurrentURL);
		driver.close();

	}

}
