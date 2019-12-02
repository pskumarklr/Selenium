package junit.Programs;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class LearnAssertions {
	@Rule
	public ErrorCollector ps = new ErrorCollector();
	
	
	@Test
	public void getTittle() {
	String actual_Tittle = "Google.com";  // Extract form Selenium Scrip
	String expected_Tittle = "Google.on"; // Compare Tittle from Excel Sheets
	
	System.out.println("Start comparing");
	try {
	Assert.assertEquals(actual_Tittle,expected_Tittle);
	}catch(Throwable t) {
		System.out.println("exception thrown");
		ps.addError(t);
	}
	System.out.println("comparing done");
	
	
	
	
	/*if (actual_Tittle==expected_Tittle) {
		System.out.println("Tittle matched");
	}
	else {
		System.out.println("tittle not matched");
	}*/
}

	
	}
