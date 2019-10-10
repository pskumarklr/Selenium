package oopsConcepts;

public class MethodOverLoding {

	public static void main(String[] args) {
		MethodOverLoding obj = new MethodOverLoding();
		obj.sum();
		obj.sum(10);
		obj.sum(10, 15);

	}
			//we can overload main method also
	public void main(int k) {
		
	}
	public void main (int k, int s) {
		
	}
	public void main (String p) {
		
	}
			// You can't create method inside a main method
			// Duplicate method-----> i.e same method name and same number of arguments are not allow
			
			//Method Overloading----> when method name is same with different arguments or parameters with in the same class
	public void sum() { // no inputs
		
		System.out.println("***** Method with Zero inputs*******");
		
	}
	
	public void sum(int a) { // one input
		
		System.out.println("***** Method with one input*******");
		System.out.println(a);
		
	}
	
	public void sum(int a, int b) { // two inputs
		
		System.out.println("***** Method with Two inputs*******");
		System.out.println(a+b);
		
	}
}
