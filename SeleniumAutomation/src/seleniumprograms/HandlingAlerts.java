package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Coimbatore (CJB)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("31")).click(); 
		Thread.sleep(2000);
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByVisibleText("6 Adults");
		Select children = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        children.selectByVisibleText("4 Children"); 
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        // handling the alert message starts now 
        Thread.sleep(4000);
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        driver.switchTo().alert().dismiss();   
        
	}

}
