package corejavaprograms;

public class ReverseAString {

	public static void main(String[] args) {
		String s = "java is interesting"; 
		int n = s.length(); 
		String rstr = ""; 
		for(int i = n-1; i>=0; i--) { 
			char c = s.charAt(i); 
			rstr = rstr+c; 
		} 
		
		System.out.println(rstr);
		
		
		

	}

}
