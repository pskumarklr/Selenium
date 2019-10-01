package corejavaprograms;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class WorkingWithPropertiesFile {

	        public static void main(String[] args) throws FileNotFoundException {
		    File f = new File("D:\\Sharath Sharma\\Selenium_30thJan_730am\\SeleniumAutomation\\testdata.properties");
	        FileInputStream fis = new FileInputStream(f);  
	        Properties prop = new Properties();  
	        
	        try {  
	             prop.load(fis);
	            }
	         
	        catch(IOException e) {
	           
	            e.printStackTrace();
	            }
	        
	        String browser = prop.getProperty("browser"); 
	        String url = prop.getProperty("url");  
	        
	        System.out.println("browser is : "+browser); 
	        System.out.println("url is : "+url);
	        

	}

}
