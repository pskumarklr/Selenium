package oopsConcepts;

public class TryAndCatchAndFinally {

	public static void main(String[] args) {
		int a[] = {10,20,30,40};
		
		try {
			System.out.println("Access element Three.."+a[2]);
		  System.out.println("Testing");
		
		}
	catch(Exception e) {
		System.out.println("Exception thrown 123.."+e);
		
	}
		finally {
			System.out.println("Element one value"+a[3]);
			System.out.println("the finally statement is exicuted");
		}
}
}