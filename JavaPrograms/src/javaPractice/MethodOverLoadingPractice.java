package javaPractice;

public class MethodOverLoadingPractice {
	
	public void santhu(int a, int b) {
		System.out.println(a+b);
	}
	
	public void santhu(int a, int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		MethodOverLoadingPractice s = new MethodOverLoadingPractice();
		s.santhu(10, 20);
		s.santhu(10, 15);
		

	}

}
