package arrayConcept;

public class OneDimentionalArray {

	public static void main(String[] args) {
    
		// Array: is store similar data type values in array variables
		//lower bound/index is 0
		//upper bound/index is n-1(where n is size of array)
		
		//Dis-Advantages
		// Size is fixed -- Static array -- to overcome this program we use Collections, Arraylist, HashTable, Dynamic Array 
		// Stores only similar data types ---- overcome this problem we use bject array
		
		
		// int array
		int i[] = new int[4];
			i[0]=5;
			i[1]=10;
			i[2]=20;
			i[3]=30;
			
			System.out.println(i[3]);
			
			System.out.println(i[0]);
			
			//System.out.println(i[5]); // ArrayIndexOutOfBoundsException (when you give out of list this error is shown)
		
			System.out.println(i.length);
			
			for(int j=0; j<4;j++) {
				System.out.println(i[j]);
			}
		
		//double array
			
			double d[]= new double[4];
			d[0]=10.5;
			d[1]=15.5;
			d[2]=20.5;
			d[3]=25.5;
			
		System.out.println(d[3]);
		System.out.println(d[0]);
		System.out.println(d.length);
		
		// char array
		
		char b[] = new char[5];
		b[0]='b';
		b[1]='c';
		b[2]='d';
		b[3]='e';
		b[4]='f';
		
		System.out.println(b[3]);
		System.out.println(b[0]);
		System.out.println(b.length);
		
		// boolen array
		
		boolean p[] = new boolean[2];
		p[0]= true;
		p[1]= false;
		
		System.out.println(p[1]);
		System.out.println(p.length);
		
		// string array
		
		String o[] = new String[3];
		o[0]="Santhosh";
		o[1]="pskumarklr";
		o[2]="Santhu";
		System.out.println(o[0]);
		
		System.out.println(o[2]);
		System.out.println(o.length);
		
		// Object array --- here Object is class -- Object stores diffirent data type values
		
		Object k[] = new Object[6];
		k[0]="Santhosh";
		k[1]="24";
		k[2]="M";
		k[3]="29/03/1995";
		k[4]="Swank Innovations";
		k[5]="2.4L";
		
		System.out.println(k[3]);
		System.out.println(k[1]);
		System.out.println(k[5]);
		System.out.println(k[2]);
		System.out.println(k[4]);
		System.out.println(k.length);
		
	}

}
