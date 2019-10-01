package seleniumprograms;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();
		driver.navigate().to("http://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Vamshi");
		Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
	}

}
