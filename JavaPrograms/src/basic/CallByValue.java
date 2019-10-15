package basic;

public class CallByValue {
	int data=50;  
	  
	 void change(int data){  
	 data=data+100;//changes will be in the local variable only  
	 }

	public static void main(String[] args) {
		CallByValue  op=new CallByValue();  
		     op.change(500);
		   System.out.println("before change "+op.data);  
		   
		   System.out.println("after change "+op.data );  
		  

	}

}
