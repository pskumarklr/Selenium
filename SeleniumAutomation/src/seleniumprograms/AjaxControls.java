package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AjaxControls {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("Desktop Site")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.linkText("Hyderabad (HYD)")).click();
        String cities = driver.findElement(By.xpath(".//*[@id='citydropdown']/tbody/tr[2]/td[2]")).getText();
        System.out.println("printing the names of cities ");
        System.out.println("..............................");
        System.out.println(cities); 
        //Using if else structure to verify if chennai is available in the list of cities
        if(cities.contains("Chennai")) { 
        	System.out.println("chennai is present.. clicking on it.... ");
        	driver.findElement(By.partialLinkText("Chennai")).click();
        }
        else{ 
        	System.out.println("Chennai is not present :( ");
        }
            
        
	}

}
