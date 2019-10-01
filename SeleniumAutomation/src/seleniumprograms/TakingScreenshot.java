package seleniumprograms;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakingScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com");
	  
		SimpleDateFormat sdf = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss"); 
		Date d = new Date();    
		String date = sdf.format(d); 
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scr, new File("D:\\screenshot_"+date+".png"));
		driver.close();
  
	}

}
