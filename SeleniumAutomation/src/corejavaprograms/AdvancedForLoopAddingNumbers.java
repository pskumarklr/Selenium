package corejavaprograms;

public class AdvancedForLoopAddingNumbers {

	public static void main(String[] args) {
		//declaring array and assigning values
		int[] num = {1,2,3,4,5} ; 
		
		int sum = 0;  
		//add elements using advanced for loop 
		for(int x : num) { 
			sum = sum+x;  
		}
		
		// print the value of sum after the end of the loop
		System.out.println("sum of elements is " + sum);
		
	}

}
