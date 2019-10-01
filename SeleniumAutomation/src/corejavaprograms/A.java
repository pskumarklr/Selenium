package corejavaprograms;

public class A { 
	
	public int x = 20; 
	private int y = 30;
	protected int z = 40;   
	
	
	
	public void f1InA() { 
		int w = x+y; 
		System.out.println(w);
	}  
	
	private void f2InA() { 
		int r = y - x; 
		System.out.println(r);
	} 
	
	protected void f3InA() { 
		int s = x*y;  
		System.out.println(s);
	}
	
		

}
