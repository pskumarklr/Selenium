package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LanguageListWikipediaHome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\browsers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize(); 
		driver.get("http://www.wikipedia.org");
		Select lan = new Select(driver.findElement(By.id("searchLanguage"))); 
        List<WebElement> lanList = lan.getOptions();
        for(WebElement e : lanList) {  
            String txt = e.getText(); 
        	System.out.println(txt); 
        	}
        driver.close();
	}

}
