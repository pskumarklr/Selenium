package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandileFileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"fileupload\"]")).sendKeys("C:\\Users\\skuma\\Desktop\\intr.txt");
		
		//driver.findElement(By.xpath("/html/body/div[1]/div/div/main/div[3]/article/div/div[3]/form/input[2]")).click();
	}

}
