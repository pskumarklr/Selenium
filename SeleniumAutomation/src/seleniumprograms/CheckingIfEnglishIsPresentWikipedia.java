package seleniumprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckingIfEnglishIsPresentWikipedia {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.wikipedia.org");
		Select lan = new Select(driver.findElement(By.id("searchLanguage")));
        List<WebElement> lanList = lan.getOptions();  
	    boolean flag = false;
        int count = 0; 
	    
        for(WebElement option : lanList) {
	    	++count; 
	    	String txt = option.getText();
	    	 
	    	if(txt.equals("English")){ 
	    		System.out.println("yeyeyeye English is found!!! in the position "+ count);
	    		
	    		flag = true; 
	    		break; 
	    		
	    	}
	    	
	    	
	    }
        
        if(flag == false) { 
        	System.out.println("Language is not found in the list! ");
        	
        	
        }
        driver.close();  
	
	}

}
