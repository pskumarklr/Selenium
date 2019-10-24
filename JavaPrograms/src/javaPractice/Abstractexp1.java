package javaPractice;

public class Abstractexp1 {
	private String name = "Santhosh";
	private int age= 24;
	private char gender = 'M';
	
	public void santhosh() {
		System.out.println("My Name is-->"+name);
		System.out.println("My Age is --->"+age);
		System.out.println("My Gender --->"+gender);
	}

	public static void main(String[] args) {
		Abstractexp1 c= new Abstractexp1();
		c.santhosh();

	}

}
