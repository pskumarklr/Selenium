package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertDissmiss {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/button")).click();
		
		Alert dis = driver.switchTo().alert();
		dis.dismiss();
		Thread.sleep(2000);
		driver.close();
	}

}
