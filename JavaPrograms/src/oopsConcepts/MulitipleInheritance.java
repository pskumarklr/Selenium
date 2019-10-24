package oopsConcepts;

class a{
	int q=10;
	int w=15;
	public void santhu() {
		System.out.println("Santhu");
	}
	}
	class b extends a{
		int e=20;
		int r=25;
	public void rithika() {
		System.out.println("Rithika");
		System.out.println(q+w);
	}
	}
	class c extends b{
		int t=30;
		int y=35;
	public void sai() {
		System.out.println("SAI");
		System.out.println(e+r);
	}
	}
public class MulitipleInheritance extends c {
	public void rahitha() {
		System.out.println("Rahitha");
		System.out.println(t+y);
	}


	public static void main(String[] args) {
		MulitipleInheritance s = new MulitipleInheritance();
		s.santhu();
		s.rithika();
		s.rahitha();
		s.sai();
		

	}

	}
