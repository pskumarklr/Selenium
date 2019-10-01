package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		WebDriverWait w = new WebDriverWait(driver, 5); 
		w.until(ExpectedConditions.elementToBeClickable(By.linkText("Coimbatore (CJB)"))).click();
		
		driver.findElement(By.linkText("31")).click(); 
		
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByVisibleText("1 Adults");
		Select children = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        children.selectByVisibleText("1 Children"); 
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        // handling the alert message starts now 
        
        
        WebDriverWait x = new WebDriverWait(driver, 20); 
        x.until(ExpectedConditions.alertIsPresent());  
        String txt = driver.switchTo().alert().getText();
        System.out.println(txt);
        driver.switchTo().alert().dismiss();   
        		
		}

}
