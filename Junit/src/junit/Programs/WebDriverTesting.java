package junit.Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTesting {
	private WebDriver driver;
	@BeforeClass
	public void Stratup() {
		driver = new FirefoxDriver();
	}
	
	@Test 
	public  void Login() throws InterruptedException {
		
		System.out.println("Test case steps");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.out.println("Appliction opened");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		System.out.println("Typing user name");
			
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		System.out.println("Typing password");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnLogin")).click();
		System.out.println("Login button click");
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	
}
