package selenium.frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes1 {

	public static  void main(String[] args) {
	  WebDriver driver =new FirefoxDriver();
	  driver.get(" http://toolsqa.com/iframe-practice-page/");
	  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	
	  driver.switchTo().frame(0);
	  driver.switchTo().defaultContent();
	  
	
	
	}

}
