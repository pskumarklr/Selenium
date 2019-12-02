package testNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OrangeHRMSlogIN {
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/";
	public WebDriver driver;
	@Before
	public void BrowserLaunch() {
		driver = new FirefoxDriver();
		driver.get(baseUrl);
	}
	@Test
	public void EnterDetails() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@Test
	public void ClickOnSubmit(){
		driver.findElement(By.id("btnLogin")).click();		
	}
	@After
	public void TakeScreenShot() throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss"); 
		Date d = new Date();    
		String date = sdf.format(d); 
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scr, new File("D:\\eclipse\\Junit\\ScreenShots\\screenshot_"+date+".png"));
	}
	
	}
