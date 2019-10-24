package javaPractice;

class OverRide{
	public void Santhu(int a, int b) {
		System.out.println(a+b);
	}
}

public class MethodOverRiding extends OverRide {
	public void Santhu(int a, int b) {
	System.out.println(a-b);
}
	public static void main(String[] args) {
		
		MethodOverRiding s= new MethodOverRiding();
		s.Santhu(20,10);
		
		OverRide a =new OverRide();
		a.Santhu(10,15);

	}

}
