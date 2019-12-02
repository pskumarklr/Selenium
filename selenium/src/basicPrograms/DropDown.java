package basicPrograms;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop =(driver.findElement(By.id("speed")));
		Select s = new Select(drop);
		List originalList = new ArrayList();
		List<WebElement> options=s.getOptions();
		for(WebElement e:options) {
			originalList.add(e.getText());
		}
		System.out.println(originalList);
		
		List sortedList = new ArrayList();
		sortedList=originalList;
		Collections.sort(sortedList);
		System.out.println(sortedList);
		driver.close();
		
		}

		
	}


