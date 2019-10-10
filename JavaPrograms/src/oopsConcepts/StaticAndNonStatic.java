package oopsConcepts;

public class StaticAndNonStatic {
		// global variable : the scope of global variables will be available across  all the functions with in the same class
	String name = "Ps Kumar Klr"; // non-static variable
	static int age = 45; // static variable
	
	public static void main(String[] args) {
			//How to calling static methods and variables
			// Directly calling
		sum();
		
			//calling by class name
		StaticAndNonStatic.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);
			// How to calling non static method and variables?
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendmail();
		System.out.println(obj.name);
		
		
	}
	
	public void sendmail() {	// non-static Method
		System.out.println("Send Mail Method");
	}
	
	public static void sum() {  //Static Method
		System.out.println("Print Sum Method");
	}

}
