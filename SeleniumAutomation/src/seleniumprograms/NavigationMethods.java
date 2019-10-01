package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		//navigating to the website 
		driver.get("http://newtours.demoaut.com"); 
		//clicking a link and going to another page
		driver.findElement(By.partialLinkText("feature")).click();
        Thread.sleep(3000); 
       // going back to the home page
       driver.navigate().back();
       Thread.sleep(3000); 
       // going forward again  
       driver.navigate().forward();
       // refresh the page 
       driver.navigate().refresh();
       //navigate to another website 
       driver.navigate().to("http://www.wikipedia.org");
       
	}

}
