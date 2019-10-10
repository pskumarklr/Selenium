package oopsConcepts;

public class Bike {
	// Class variables
	int mod;
	int wheel;

	public static void main(String[] args) {
		//new Bike() is object
		// new keyword is used create object
		// a,b,c are object reference variables
		
		Bike a = new Bike();
		Bike b = new Bike();
		Bike c = new Bike();
		
		a.mod=2015;
		a.wheel=2;
		
		b.mod=2016;
		b.wheel=2;
		
		c.mod=2017;
		c.wheel=2;
		
		System.out.println(a.mod);
		System.out.println(c.mod);
		
		

	}

}
