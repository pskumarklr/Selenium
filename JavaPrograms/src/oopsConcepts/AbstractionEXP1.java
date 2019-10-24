package oopsConcepts;

public class AbstractionEXP1 {
	private int account = 123456;
	private String name = "Santhosh Kumar";
	private float bal =20000;
	
	
	public void bank() {
		System.out.println("Account no "+account);
		System.out.println("Account Name "+name);
		System.out.println("Balance "+bal);
	}

	public static void main(String[] args) {
		AbstractionEXP1 b = new AbstractionEXP1();
		b.bank();
		

	}

}
