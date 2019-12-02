package junit.practice;

//import org.junit.Before;
import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {
	
	@BeforeClass
	public void LaunchBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("Firefox browser is opening....");
	}
	
	/*@Test
	public void NaviagteToUrl() {
	
		
	}*/

}
