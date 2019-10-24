package javaPractice;

public class EncapsulationPractice {
	private char a= 'P';
	private String name = "Santhos Kumar";
	private int age = 24;
	
	public void details() {
		System.out.println("My name Initial is.."+a);
		System.out.println("My Name Is.."+name);
		System.out.println("My age is..."+age);
	}

	public static void main(String[] args) {
		EncapsulationPractice s = new EncapsulationPractice();
		s.details();
		

	}

}
