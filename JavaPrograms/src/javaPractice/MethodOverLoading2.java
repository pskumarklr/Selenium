package javaPractice;

public class MethodOverLoading2 {
	
	public static void main(String[] args) {
		MethodOverLoading2 obj = new MethodOverLoading2();
		  obj.sum();
		  obj.sum(10);
		  obj.sum(20+5);
	}


		public void sum() {
			System.out.println("************** No inputs ******************");
		}
		
		public void sum(int k) {
			System.out.println("******* Method with Single Input*************");
			System.out.println(k);
			
		}
		
		public void sum(int k, int l) {
			System.out.println("*******Method with Two Inputs*********");
			System.out.println(k+l);
		}
	}


