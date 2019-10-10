package oopsConcepts;

public class LocalAndGlobalVariables {
			//Global or Class variables
	String name = "PsKumarKlr";
	int a=10;
			// global variables are access anywhere in program
	public static void main(String[] args) {
		int i=15; // Local Variables 
			// local variables access within the method
		System.out.println(i);
			// if you access the global variables you most create object
		
		LocalAndGlobalVariables obj = new LocalAndGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.a);

	}
	public void kumar() {
		int k=20; // local variable for kumar method
		int s=15;
		System.out.println(k);
		
	}

}

