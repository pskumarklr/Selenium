package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebMailUsingFireFox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\library\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.one.com/en/");
		driver.findElement(By.id("Webmail")).click();
		driver.findElement(By.className("username")).sendKeys("santoshkumar@swankinnovation.com");
		driver.findElement(By.className("password")).sendKeys("vickypsk@8523");
		driver.findElement(By.className("oneButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("compose-button-label")).click();
		Thread.sleep(2000);
        driver.findElement(By.id("to")).sendKeys("skumarp852@gmail.com");
        Thread.sleep(2000);
        //driver.findElement(By.id("subject")).sendKeys("Hi Check This Mail");
        //driver.findElement(By.xpath("/html/body/div[1]")).sendKeys("This is for Automation Testing");
        driver.findElement(By.className("icon-send")).click();
	}

}
