package working.with.junit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class JUnitBasicsClass {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("pre-condition for class ex:connecting to server");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("post-condition for class ex:disconnecting from server");
		
	}

	@Before
	public void setUp() throws Exception { 
		
		System.out.println("pre-condition for test method ex:launching browser");
	}

	@After
	public void tearDown() throws Exception {
		
	   System.out.println("post-condition for test method ex:closing browser");
	}

	@Test
	public void test1() {
		System.out.println("inside test method1");
	}
	
	
	@Test
	public void test2() {
		System.out.println("inside test method2");
	}
	
	@Ignore
	@Test
	public void test3() {
		System.out.println("inside test method3");
	}
	
	@Test
	public void test4() { 
		
		System.out.println("inside test method4");
		
	}
	
	@Test
	public void test5() { 
		int expected = 20; 
		int actual = 30; 
		
		Assert.assertEquals(expected,actual);
		
	}
	

}
