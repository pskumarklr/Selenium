package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ClickOnCurrencyConverter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Delhi (DEL)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("25")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByValue("3");
		
		Select child = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		child.selectByValue("2");
		
		Select infant = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		infant.selectByValue("1");
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("popUpConverter")).click();
		
	//driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency")).click();
	Select INR = new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListBaseCurrency")));
	INR.selectByVisibleText("Indian Rupee(INR)");
	
	Select LKR = new Select(driver.findElement(By.id("CurrencyConverterCurrencyConverterView_DropDownListConversionCurrency")));
	LKR.selectByVisibleText("Sri Lankan Rupee(LKR)");
	
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_TextBoxAmount")).sendKeys("3000");
	
	driver.findElement(By.id("CurrencyConverterCurrencyConverterView_ButtonConvert")).click();
	
	String t = driver.getTitle();
	System.out.println(t);
	
	driver.close();
	
	}

}
