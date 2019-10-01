package working.with.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		driver.get("http://www.google.com"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}

}






