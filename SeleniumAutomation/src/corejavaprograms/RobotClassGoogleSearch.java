package corejavaprograms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotClassGoogleSearch {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("seleni");
		Thread.sleep(3000);
        //create an object of Robot class. 
		Robot rb = new Robot(); 
		//press the keys
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		//improvise the above code with the below steps 
		/*for(int i =1; i<=3;i++) { 

			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);

			} 
*/
		
		
		
	}

}
