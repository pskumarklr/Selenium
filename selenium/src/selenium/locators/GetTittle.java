package selenium.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTittle {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String GetTittle = driver.getTitle();
		System.out.println(GetTittle);
		driver.close();

	}

}
