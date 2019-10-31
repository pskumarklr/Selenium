package javaPractice;

import java.util.*;

public class SwapTwoValue {

	public static void main(String[] args) {
		int x, y, temp;
		 Scanner obj = new Scanner(System.in);
		 System.out.println("Enter Output Values");
		 x=obj.nextInt();
		 y=obj.nextInt();
		 System.out.println("Before Swapping \n X="+x + "\n Y="+y);
		 
		 temp=x;
		 x=y;
		 y=temp;
		 
		 System.out.println("After Swapping \n X="+x + "\n Y="+y);
		
		
		
	}

}
