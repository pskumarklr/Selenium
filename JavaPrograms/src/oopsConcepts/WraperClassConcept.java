package oopsConcepts;

public class WraperClassConcept {

	public static void main(String[] args) {
			//Data Conversion string to int
		String y = "2000";
		System.out.println(y+200);
		int i =Integer.parseInt(y);
		System.out.println(i+20);
		
		
		//Integer, double, boolean
		 
		// String to Double conversion
		String s= "20.23";
		System.out.println(s+15);
		Double p =Double.parseDouble(s);
		System.out.println(p+20);
		
		// String to boolean
		String l = "True";
		System.out.println(l+20);
		Boolean k = Boolean.parseBoolean(l);
		System.out.println(k);
		
		// int to string converter
		
		int o = 20;
		System.out.println(o+10);
		
		String q=String.valueOf(o); // o= "200"
		System.out.println(q+200);
		
		String t ="100A";
		System.out.println(t+20);
		Integer.parseInt(t); //NumberFormatException
	}

}
