package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CloseAndQuit {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		//creating an object for the drop down list 
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click(); 
		Thread.sleep(3000);
		driver.findElement(By.linkText("Coimbatore (CJB)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("31")).click();
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByIndex(1);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click(); 
		Thread.sleep(3000); // wait for some time before the next page loads
        driver.findElement(By.linkText("Currency Converter")).click();
	    // finish your tasks or steps and close the browser. 
        Thread.sleep(3000);
        driver.quit();  
        //try with driver.close()
        // try to keep a browser that is manually opened. 
        // run the program and observe the flow. 
           
        
	
	}

}
