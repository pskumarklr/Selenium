package working.with.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParameterizationInFunctions {

	WebDriver driver; 
	
	public void launch() { 
		driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}   
	
	public void clickLinkPrintTitle(String linktext) throws Exception{ 
		driver.findElement(By.linkText(linktext)).click();
		Thread.sleep(2000); 
        String t = driver.getTitle();
        System.out.println(t);
	} 


	
		
	public void close(){ 
		driver.close();
	}
	public static void main(String[] args) throws Exception { 
		
		ParameterizationInFunctions obj = new ParameterizationInFunctions(); 
		
		//Register link 
		obj.launch();
		obj.clickLinkPrintTitle("REGISTER");
		obj.close();
		
		//Sign-On
		obj.launch();
		obj.clickLinkPrintTitle("SIGN-ON");
		obj.close(); 
		
		//Destinations
		obj.launch();
		obj.clickLinkPrintTitle("Destinations");
		obj.close();
		

	}

}
