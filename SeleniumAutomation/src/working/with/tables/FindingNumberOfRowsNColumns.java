package working.with.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindingNumberOfRowsNColumns {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
        // printing the no. of rows from the below 2 lines 
		int rows = driver.findElements(By.xpath(".//table[@width='270']/tbody/tr")).size();
        System.out.println("number of rows is "+rows);
       // printing the no. of cols from the below 2 lines
       int col = driver.findElements(By.xpath(".//table[@width='270']/tbody/tr[2]/td")).size();
       System.out.println("number of cols is "+col);
       driver.close();
       
	}

}
