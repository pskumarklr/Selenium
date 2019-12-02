package basicPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");
		
		//driver.switchTo().frame("Drag and Drop");
		
		WebElement S1 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
		WebElement S2 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[2]"));
		WebElement S3 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[3]"));
		WebElement S4 = driver.findElement(By.xpath("//*[@id=\"todrag\"]/span[4]"));
		
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
		
		Actions ps = new Actions(driver);
		ps.dragAndDrop(S1, drop)
		.dragAndDrop(S2, drop)
		.dragAndDrop(S3, drop)
		.dragAndDrop(S4, drop).build().perform();
	}

}
