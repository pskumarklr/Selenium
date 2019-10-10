package oopsConcepts;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created, object is the reference variable, referring to this object
		//after creating the object the copy of all non-static methods will be given to this object
		obj.santhu();
		
		int s=obj.rithika();
		System.out.println(s);
		
		String p=obj.bunny();
		System.out.println(p);
		
		int a=obj.division(10, 5);
		System.out.println(a);
	}
	// non static method
	// void ---> doesn't return any value
	// return type = void
	public void santhu() { // no input, no output
		System.out.println("Santhu method");

	}
	// return type is int
	public int rithika() { //no input, some output
		System.out.println("Rithika Method");
		int a= 10;
		int b=15;
		int c= a+b;
		return(c);
	}
	// return type is string
	public String bunny() { // no input , some output
		System.out.println("Bunny Method");
		String s = "Selenium Webdriver";
		return(s);
	}
	// return type is int
	// x,y input parameters or arguments
	
	 public int division(int x, int y) {
		 System.out.println("division Method");
		 int d =x/y;
		 return(d);
	 }
	
}
