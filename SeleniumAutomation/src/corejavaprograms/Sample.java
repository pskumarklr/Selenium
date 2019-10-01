package corejavaprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("seleni");
		Thread.sleep(3000);	
		String str = driver.findElement(By.className("sbsb_a")).getText(); 
	    System.out.println(str);
	    
	}

}
