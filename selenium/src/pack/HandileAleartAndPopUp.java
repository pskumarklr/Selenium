package pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandileAleartAndPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText()); //Get the text from alert
		alert.accept(); // use to click on ok or accept
		// alert.dismiss(); is use to no or dismiss the alert 
		Thread.sleep(5000);
		driver.close();
	}

}
