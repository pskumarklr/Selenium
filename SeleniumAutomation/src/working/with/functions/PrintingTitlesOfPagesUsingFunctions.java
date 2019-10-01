package working.with.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintingTitlesOfPagesUsingFunctions {

	WebDriver driver; 
	
	
    public void launch() { 
		driver = new FirefoxDriver(); 
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
    
    public void register() throws Exception { 
    	driver.findElement(By.linkText("REGISTER")).click(); 
        Thread.sleep(2000); 
        String t = driver.getTitle();
        System.out.println(t);
        
    }
    
    public void signOn() throws Exception {  
    	driver.findElement(By.linkText("SIGN-ON")).click(); 
        Thread.sleep(2000); 
        String t = driver.getTitle();
        System.out.println(t);
    	
    }
    
    public void Destinations() throws Exception {
    	driver.findElement(By.linkText("Destinations")).click();
    	Thread.sleep(2000); 
        String t = driver.getTitle();
        System.out.println(t);
    	
    }
         
	 
	public void close(){ 
		
		driver.close(); 
	}
		
	
	
	public static void main(String[] args) throws Exception {  
		
		PrintingTitlesOfPagesUsingFunctions obj = new PrintingTitlesOfPagesUsingFunctions(); 
		
		//working on sign on link and closing 
		obj.launch();
		obj.signOn();
		obj.close();
		
		// working on REGISTER link and closing 
		
		obj.launch();
		obj.register();
		obj.close();
		
		// working on Destinations link 
		obj.launch();
		obj.Destinations();
		obj.close();
		

	}

}
