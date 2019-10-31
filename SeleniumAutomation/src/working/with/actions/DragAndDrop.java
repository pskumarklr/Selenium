package working.with.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://code.makery.ch/library/dart-drag-and-drop/");
        driver.manage().window().maximize();
		
        // switch to the frame and create variables for trash items 
        driver.switchTo().frame(0); 
        WebElement trash1 = driver.findElement(By.xpath("html/body/div/img[1]")); 
        WebElement trash2 = driver.findElement(By.xpath("html/body/div/img[2]"));
        WebElement trash3 = driver.findElement(By.xpath("html/body/div/img[3]"));
        WebElement trash4 = driver.findElement(By.xpath("html/body/div/img[4]"));
        
        // create variable for dustbin item 
        WebElement dustBin =  driver.findElement(By.xpath("html/body/div/div"));
        
		Actions as = new Actions(driver); 
        
        as.dragAndDrop(trash1,dustBin).dragAndDrop(trash3,dustBin)
        .dragAndDrop(trash2,dustBin)
        .dragAndDrop(trash4,dustBin).build().perform(); 
        
       
        
	}

}


