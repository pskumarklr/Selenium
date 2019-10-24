package javaPractice;

abstract class Abstractexp2 {
	abstract void santhu(double s);
}
 class sub1 extends Abstractexp2 {
	 void santhu(double s) {
		 System.out.println("SQUARE .."+(s*s));
	 }
	 
 }
 
 class sub2 extends Abstractexp2{
	 void santhu(double s) {
		 System.out.println("Square root of s..."+Math.sqrt(s));
	 }
 }
 
 	class pskumarklr{ 
	public static void main(String[] args) {
		sub1 s1 = new sub1();
		sub2 s2 = new sub2();
		s1.santhu(6);
		s2.santhu(9);
		
		

	}

 	}
