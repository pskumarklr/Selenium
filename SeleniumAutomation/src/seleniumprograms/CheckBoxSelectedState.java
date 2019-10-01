package seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxSelectedState {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();
        driver.findElement(By.linkText("Desktop Site")).click();
		Thread.sleep(3000);
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        Thread.sleep(2000);
        boolean b = driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected();
        if(b == true){ 
        	System.out.println("check box is selected");
        	
        }
        else { 
        	System.out.println("check box is not selected");	
        }
        
	}

}
