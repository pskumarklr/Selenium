package working.with.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SpiceJetCuteFee {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("Desktop Site")).click();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.linkText("Hyderabad (HYD)")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Coimbatore (CJB)")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("31")).click(); 
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click(); 
		Thread.sleep(6000);
        String feeName = driver.findElement(By.xpath(".//table[@class='priceSummary']/tbody/tr[2]/td[1]")).getText();
        System.out.println(feeName);
        String fee = driver.findElement(By.xpath(".//table[@class='priceSummary']/tbody/tr[2]/td[2]")).getText();
            
		System.out.println(feeName+" is : "+fee);
        
        
        
	}

}
