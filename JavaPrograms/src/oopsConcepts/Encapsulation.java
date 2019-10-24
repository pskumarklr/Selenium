package oopsConcepts;

public class Encapsulation {
	
	private String name ="Santhosh";
	private int age  = 24;
	
	public void pskumarklr() {
		System.out.println("My Name is " +name);
		System.out.println("My Age is " +age);
	}

	public static void main(String[] args) {
		Encapsulation q = new Encapsulation();
		q.pskumarklr();
		

	}

}
