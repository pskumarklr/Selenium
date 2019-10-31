package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.interactions.Actions;

public class WorkingWithFrames {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://code.makery.ch/library/dart-drag-and-drop/");
		
		driver.switchTo().frame(0);
		
		WebElement trash1 = driver.findElement(By.xpath("/html/body/div/img[1]"));
		WebElement trash2 = driver.findElement(By.xpath("/html/body/div/img[2]"));
		WebElement trash3 = driver.findElement(By.xpath("/html/body/div/img[3]"));
		WebElement trash4 = driver.findElement(By.xpath("/html/body/div/img[4]"));
		
		
		WebElement bin = driver.findElement(By.xpath("/html/body/div/div"));
		
		Actions move = new Actions(driver);
		
		move.dragAndDrop(trash1,bin).dragAndDrop(trash2,bin).dragAndDrop(trash3, bin).dragAndDrop(trash4, bin).build().perform();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.linkText("Source on GitHub")).click();
		
		
	}

}
