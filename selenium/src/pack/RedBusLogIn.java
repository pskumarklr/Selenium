package pack;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class RedBusLogIn {

	public static void main(String[] args) {
		
		/*FirefoxOptions Options = new FirefoxOptions();
		Options.addArguments("--disable-notifications");*/
		FirefoxProfile profile = new FirefoxProfile();
	    profile.setPreference("permissions.default.desktop-notification", 1);
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("sign-in-icon-down")).click();
		driver.findElement(By.id("signInLink")).click();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[3]/div[7]/div/div/div")).click();
		
		
		driver.close();
	}

}
