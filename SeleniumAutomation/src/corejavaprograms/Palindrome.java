package corejavaprograms;

public class Palindrome {

	public static void main(String[] args) {
		String s = "malayalam"; 
		int n = s.length(); 
		int count = 0;  
		for(int i = 0;i<n;i++){ 
			char c = s.charAt(i); 
			char rc = s.charAt(n-i-1); 
			if(c != rc){ 
				count = count+1;
				break; // break the iteration if a mismatch
			           // is found 
			}
			
		}
		
		if(count != 0){
			System.out.println("The string is not palindrome");
			
		}
		
		else{ 
			System.out.println("Palindrome");
		}
		
		
		

	}

}
