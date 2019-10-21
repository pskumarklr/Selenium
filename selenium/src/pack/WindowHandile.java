package pack;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandile {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Thread.sleep(2000);
		Set<String> Handle = driver.getWindowHandles();
		Iterator<String> it = Handle.iterator();
		
		String ParentWindowID = it.next();
		System.out.println("Parent Window ID is:"+ParentWindowID);
		Thread.sleep(2000);
		
		String ChaildWindowID = it.next();
		System.out.println("Chaild winodow ID is:"+ChaildWindowID);
		
		Thread.sleep(2000);
		
		driver.switchTo().window("ChaildWindowID");
		 System.out.println("Chaild window pop up tittle is"+driver.getTitle());
		 
		 driver.close();
		 
		 Thread.sleep(2000);
		 
		 driver.switchTo().window("ParentWindowID");
		 System.out.println("Parent window pop up tittle is"+driver.getTitle());
		
		

	}

}
