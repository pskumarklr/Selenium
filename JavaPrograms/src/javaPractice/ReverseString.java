package javaPractice;

public class ReverseString {

	public static void main(String[] args) {
		String s ="Santhosh";
		int n =s.length();
		String rstr="";
		for(int i=n-1; i>=0;i--) {
			char p = s.charAt(i);
			rstr = rstr+p;
			
		}
		System.out.println(rstr);
		
		
		
	
	}

}
