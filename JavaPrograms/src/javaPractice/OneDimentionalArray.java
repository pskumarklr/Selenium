package javaPractice;

public class OneDimentionalArray {

	public static void main(String[] args) {
		 System.out.println("***************Integer Array*************");
		 
		// Integer array
		int i[] = new int[4];
		 i[0] = 5;
		 i[1] = 6;
		 i[2] = 7;
		 i[3] = 8;
		 System.out.println(i[3]);
		 System.out.println(i.length);
		 System.out.println("***********Char Array**************");
		 // Char Array
		 
		 char a[]= new char[3];
		 a[0]='A';
		 a[1]='B';
		 a[2]='C';
		 System.out.println(a[2]);
		 System.out.println(a[0]);
		 System.out.println(a.length);
		 System.out.println("************String Array**************");
		 
		 // string array
		 
		 String b[]= new String[4];
		 b[0]="Ps Kumar klr";
		 b[1]="Santhu";
		 b[2]=	"Psk";	 
		 b[3]=	"Santhosh";
		 System.out.println(b[2]);
		 System.out.println(b[1]);
		 System.out.println(b[0]);
		 System.out.println(b.length);
		 
		 System.out.println("*************Double Array**************");
		 
		 // Double array
		 
		 double c[]= new double[3];
		 c[0]=20.54;
		 c[1]=26.23;
		 c[2]=25.14;
		  System.out.println(c[1]);
		  System.out.println(c[0]);
		  System.out.println(c[2]);
		  System.out.println(c.length);
		  
		  System.out.println("************Object array***************");
			
		  //object array
		  
		  Object o[] = new Object[4];
		  o[0] = "Santhosh";
		  o[1] = 'P';
		  o[2] =20;
		  o[3] =15.25;
		  System.out.println(o[0]);
		  System.out.println(o[2]);
		  System.out.println(o[1]);
		  System.out.println(o[3]);
		  System.out.println(b.length);
		  
		  System.out.println("*******************END******************");
			 
	}

}
