package working.with.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MercuryToursTitles {

	WebDriver driver;  
	
	public String clickLink(String lnkTxt) { 
		driver.findElement(By.linkText(lnkTxt)).click();
		String actTitle = driver.getTitle();
		return actTitle; 
	}
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		
	}

	@After
	public void tearDown() throws Exception {
		driver.close();
		
	}

	@Test
	public void register() { 
		
		String actTitle = clickLink("REGISTER"); 
		String expTitle = "Register: Mercury Tours";
		System.out.println(actTitle); 
		Assert.assertEquals(actTitle, expTitle);
				
	} 
	
	
	@Test
	public void signOn() {  
		String actTitle = clickLink("SIGN-ON"); 
		String expTitle = "Sign-on: Mercury Tours";
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
						
	}
	
	
	@Test
	public void cruises() { 
		String actTitle = clickLink("Cruises");  
		String expTitle = "Cruises: Mercury Tours"; 
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
			
		
	}

}
