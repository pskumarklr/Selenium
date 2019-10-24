package oopsConcepts;

abstract class AbstractionEXP2 {
	abstract void santhu(double x);
}
	class sub1 extends AbstractionEXP2 {
		
		void santhu(double x) {
			System.out.println("Square ="+(x*x));
		}
	}
	
	class sub2 extends AbstractionEXP2{
		void santhu(double x) {
			System.out.println("Square root=" +Math.sqrt(x));
		}
	}
	class Differient{
	public static void main(String[] args) {
		sub1 s= new sub1();
		sub2 q = new sub2();
		s.santhu(5);
		q.santhu(7);
	}
		
	}


