package corejavaprograms;

import java.io.FileNotFoundException;

import org.openqa.selenium.ElementNotVisibleException;

public class ExceptionHandling {

	public static void main(String[] args) throws Exception {
		int u = 20; 
		int v = 0;  
		
						
		try { 
			
				    
		    throw new ElementNotVisibleException("Demonstrating exceptions in Selenium"); 
		     			
		}    
		
				
		catch(ElementNotVisibleException el) { 
			el.printStackTrace();
		}
		
		finally { 
			 
			System.out.println("statements that must be executed irrespective of the occurrence of an exception ");
					
		}
		
			
		
		
		
		 
		System.out.println("Statement 1 after division");
		System.out.println("Statement 2 after division");
		
		
		
	}

}
