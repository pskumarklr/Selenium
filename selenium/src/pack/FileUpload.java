package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		
		WebElement file=driver.findElement(By.name("userfile"));
		
		file.sendKeys(("C:\\Users\\skuma\\Desktop\\_HK57319.jpg"));
		
		driver.findElement(By.xpath("/html/body/form/input[2]")).click();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
