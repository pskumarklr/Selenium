package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToWindowUsingWindowHandle {

	public static void main(String[] args) throws InterruptedException {
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
        String pwh = driver.getWindowHandle(); 
		driver.findElement(By.linkText("Currency Converter")).click();
	    Thread.sleep(3000); 
        for(String wh : driver.getWindowHandles()) {  
        	driver.switchTo().window(wh);
        	        	
        }
        // focus switched to the new window. work on it and close it 
        Thread.sleep(3000);
	    // now create an object for the base currency in the child window 
	    Select base = new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency"))); 
	    base.selectByVisibleText("US Dollar(USD)");
	    Thread.sleep(3000); 
	    Select toCurrency = new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency")));
	    toCurrency.selectByVisibleText("Indian Rupee(INR)");
	    driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("50000");
	    Thread.sleep(3000);
	    driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
        Thread.sleep(3000);
        driver.close();   
        Thread.sleep(2000);
        driver.switchTo().window(pwh); 
        // clicking an element to check if you switched back to original window. 
        driver.findElement(By.linkText("Contact Us")).click();
        
	}

}
