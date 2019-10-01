package working.with.tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ComparingFareFromNYtoChicago {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		String txt = driver.findElement(By.xpath(".//table[@width='270']/tbody/tr[4]/td[2]")).getText(); 
	    System.out.println(txt);
	    String fare = txt.substring(1);
	    int x = Integer.parseInt(fare);
	    if(x<=200) { 
	    	System.out.println("yeyeye! discounts!!! fare is less than 200. ");
	    }
	    else { 
	    	System.out.println("fare is greater than 200");
	    }
	   
	    driver.close();
	        
	}

}
