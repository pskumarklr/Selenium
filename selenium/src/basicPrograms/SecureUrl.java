package pack;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecureUrl {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		String url =driver.getCurrentUrl();
		System.out.println("Cureent Url is.."+url);
		
		
		if(url.startsWith("https")) {
			System.out.println("This URL is Secured.....>"+url);
		}
		else {
			System.out.println("This URL is Unsecured.....>"+url);
		}
		driver.close();
	}

}
