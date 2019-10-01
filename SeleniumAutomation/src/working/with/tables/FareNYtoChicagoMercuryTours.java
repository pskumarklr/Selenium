package working.with.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FareNYtoChicagoMercuryTours {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		String fare = driver.findElement(By.xpath(".//table[@width='270']/tbody/tr[4]/td[2]")).getText(); 
        System.out.println(fare);
	}

}
