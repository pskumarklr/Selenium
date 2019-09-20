package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
	 
		WebDriver driver=new ChromeDriver();

	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	Thread.sleep(2000);
	driver.findElement(By.id("btnLogin")).click();
	driver.close();
	
	}
	

}
