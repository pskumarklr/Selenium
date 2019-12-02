package pack;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCurrentTittle {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		String tittle = driver.getTitle();
		System.out.println("Given tittle is....>"+tittle);
		
		String a ="Facebook";
		String b = driver.getTitle();
		
		if (a.equals(b)) {
			System.out.println("Given tittle is real..."+tittle);
		}
		else {
			System.out.println("Given tittle i not match.."+tittle);
		}
		driver.close();
	}

}
