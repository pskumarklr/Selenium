package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class SpicejetSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Bengaluru (BLR)")).click();
	    driver.findElement(By.linkText("Hyderabad (HYD)")).click();
	    driver.findElement(By.linkText("28")).click();
	    driver.findElement(By.id("divpaxinfo")).click();
	    driver.findElement(By.id("hrefIncAdt")).click();
	    Thread.sleep(2000);
	    for (int i=0; i<3;i--) {
	    	
	    	driver.findElement(By.id("hrefIncAdt")).click();
	    	
	    }
	    driver.findElement(By.id("btnclosepaxoption")).click();
	   //WebElement currency = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    //Select curncy = new Select(currency);
	    //curncy.deselectByValue("INR");;
	    driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	    
	    Thread.sleep(5000);
	    
	    driver.close();
	}

}
