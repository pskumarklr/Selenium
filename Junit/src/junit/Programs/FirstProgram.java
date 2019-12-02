package junit.Programs;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class FirstProgram {
	@BeforeClass
	public static void initializeSelenium() {
		System.out.println("Install the selenium server");
	}
	
	@Before
	public void openBrowser() {
		System.out.println("Chrome browser is opening");
	}
	
	@Test
	public void testNavigations(){
		System.out.println("Browser open");
	}
	@Ignore //is used igone test
	@Test
	public void testLoginDetais() {
		System.out.println("Login Sucessfully completed");
	}
	
	@After
	public void closeBrowser() {
		System.out.println("chrome browser is closed");
	}

	@AfterClass
	public static void closeSelenium() {
		System.out.println("Shutdown Selenium ");
	}
}
