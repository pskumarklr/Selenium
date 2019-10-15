package javaPractice;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		String s[][] = new String[4][4];
		System.out.println(s.length);
		System.out.println(s[0].length);
		s[0][0]= "A";
		s[0][1]= "B";
		s[0][2]= "C";
		s[0][3]= "D";
		
		s[1][0]= "A1";
		s[1][1]= "B1";
		s[1][2]= "C1";
		s[1][3]= "D1";
		
		s[2][0]= "A2";
		s[2][1]= "B2";
		s[2][2]= "C2";
		s[2][3]= "D2";
		
		s[3][0]= "A3";
		s[3][1]= "B3";
		s[3][2]= "C3";
		s[3][3]= "D3";
		
		System.out.println(s[1][3]);
		System.out.println(s[3][2]);
		System.out.println(s[2][0]);
		
		for (int row =0; row<s.length; row++) {
			for (int col =0; col<s[0].length;col++) {
				System.out.println(s[row][col]);
			}
		}
	}

}
