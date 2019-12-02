package testNG;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNGprogram1 {
	public String baseURL ="https://www.spicejet.com/";
	public WebDriver driver;
	
	@Before
	public void baseurl() {
		driver = new ChromeDriver();
		driver.get(baseURL);
		
	}
	@Test
	public void verifyTitleOfPage() {
		String expectedTitle = "Spicejet";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@After
	public void close() {
		driver.close();
	}
	

}