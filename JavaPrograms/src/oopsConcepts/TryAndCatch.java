package oopsConcepts;

public class TryAndCatch {

	public static void main(String[] args) {
		try {
			int b= 10/0;
			System.out.println(b);
		}
		
		catch(Exception e) {
			
			System.out.println("Exception Thrown:"+e);
		}
		System.out.println("Out of the block");
	}

}
