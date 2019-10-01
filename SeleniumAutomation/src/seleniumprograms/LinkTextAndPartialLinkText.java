package seleniumprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkTextAndPartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com");
		//printing linktext using partial linktext
		String lnkTxt = driver.findElement(By.partialLinkText("feature")).getText();
		System.out.println(lnkTxt);
        //clicking the link by mentioning the partial link text
		driver.findElement(By.partialLinkText("feature")).click();
		driver.close();
    	
	
	}

}
