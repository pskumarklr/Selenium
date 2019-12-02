package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(5000);
		driver.get("https://login.one.com/mail");
		
		driver.manage().window().maximize();
		driver.findElement(By.className("username")).sendKeys("santoshkumar@swankinnovation.com");
		driver.findElement(By.className("password")).sendKeys("rakeshsk@8523");
		driver.findElement(By.className("oneButton")).click();
	}

}
