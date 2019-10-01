package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleOfGoogleHomePage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.get("http://www.google.com"); 
		String t = driver.getTitle();
		System.out.println(t); 
		Thread.sleep(3000);
		driver.close();
		
		
		//login
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]")).click();
		System.out.println("login button completdd");
		
		
		
	}

}
