package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMultipleSelectionCheck {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize(); 
		driver.findElement(By.linkText("Desktop Site")).click();
		Thread.sleep(2000);
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult"))); 
		boolean mul = adult.isMultiple(); 
		if(mul == true){ 
			System.out.println("drop down allows multiple selection. ");
			
		}
		else { 
			System.out.println("drop down doesn't allow multiple selection. ");	
		}
		
		

	}

}
