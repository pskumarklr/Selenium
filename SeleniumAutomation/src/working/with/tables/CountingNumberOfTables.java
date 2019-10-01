package working.with.tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountingNumberOfTables {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		List<WebElement> tables = driver.findElements(By.tagName("table")); 
		int count = tables.size(); 
        // you can also write the below line instead of the above 2 lines. 
		//int count = driver.findElements(By.tagName("table")).size(); 
	    System.out.println("number of tables is "+count);
	    driver.close(); 
	}

}
