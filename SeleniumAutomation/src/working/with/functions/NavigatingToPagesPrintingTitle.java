package working.with.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingToPagesPrintingTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		driver.findElement(By.linkText("SIGN-ON")).click();
		Thread.sleep(3000); 
		String t = driver.getTitle();
		System.out.println(t); 
		//come back to the home page 
		driver.navigate().back(); 
		// clicking on REGISTER link and printing title 
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(3000); 
		String u = driver.getTitle();
		System.out.println(u);
		
		// come back to the home page 
		driver.navigate().back();
		// click on Destinations link and print the title 
		driver.findElement(By.linkText("Destinations")).click();
		Thread.sleep(3000); 
		String v = driver.getTitle();
		System.out.println(v);
		
		driver.close();

	}

}
