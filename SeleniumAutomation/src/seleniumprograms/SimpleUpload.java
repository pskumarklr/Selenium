package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleUpload {

	public static void main(String[] args) {
       WebDriver driver = new FirefoxDriver();
       driver.get("https://www.freepdfconvert.com/");
	   driver.findElement(By.id("clientUpload")).sendKeys("C:\\Users\\admin\\Desktop\\testdata1.txt");	
	   
	}

}
