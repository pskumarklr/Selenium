package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintSourceCode {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.flipkart.com");
		String code = driver.getPageSource();
		System.out.println(code);
		
		driver.close();
	}

}
