package working.with.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MentioningTableNumber {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
        String txt = driver.findElement(By.xpath(".//table[1]/tbody/tr[7]/td[2]")).getText(); 
	    System.out.println(txt);
	    driver.close();
	}

}
