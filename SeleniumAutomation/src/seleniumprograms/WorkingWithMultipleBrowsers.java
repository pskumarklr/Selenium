package seleniumprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class WorkingWithMultipleBrowsers {
     
	public void useFirefox() {  
		System.out.println("launching firefox...... ");
		WebDriver driver = new FirefoxDriver(); 
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
				
	}
	
	public void useIE(){ 
		System.setProperty("webdriver.ie.driver","D:\\Sharath Sharma\\library\\IEDriverServer.exe");
		System.out.println("launching IE...... ");
		WebDriver driver = new InternetExplorerDriver(); 
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title); 
		
		
	}
	
	public void useChrome() {    
		
		System.setProperty("webdriver.chrome.driver","D:\\Sharath Sharma\\library\\chromedriver.exe");
		System.out.println("launching Chrome...... ");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);	 
			
	}
	
public void useOpera() {  
	
	System.setProperty("webdriver.opera.driver","D:\\Sharath Sharma\\library\\operadriver.exe");
	System.out.println("launching Opera...... ");
	WebDriver driver = new OperaDriver(); 
	driver.get("http://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);	 
		
	}
	
		
	public static void main(String[] args) {  
		
		WorkingWithMultipleBrowsers browsers = new WorkingWithMultipleBrowsers(); 
		browsers.useFirefox();
		browsers.useChrome();
		browsers.useIE(); 
		browsers.useOpera();
		
		

	}

}
