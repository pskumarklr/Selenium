package working.with.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartSamsungFirstItemPrice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com");
		Actions as = new Actions(driver);  
		as.moveToElement(driver.findElement(By.linkText("ELECTRONICS"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Samsung")).click();
		Thread.sleep(2000); 
		String price = driver.findElement(By.xpath(".//*[@id='container']/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/div[1]/a/div[2]/div[2]/div[1]/div/div[1]")).getText();
		System.out.println(price);
		

	}

}
