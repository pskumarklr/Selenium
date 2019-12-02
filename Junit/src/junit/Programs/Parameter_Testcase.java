package junit.Programs;

//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

// First Step
@RunWith(Parameterized.class)
public class Parameter_Testcase {
	
	//second step define parameters
	String firstname;
	String lastname;
	String password;
	int age;
	
	// Third step
	public Parameter_Testcase(String firstname,	String lastname,String password,int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.password= password;
		this.age = age;
	
	}
	
	// fourth step
	
	@Parameters
	public static Collection<Object[]> getData(){
		Object[][] data = new Object[2][4];
		
		//first row
		data[0][0]="Santhosh";
		data[0][1]="Kumar";
		data[0][2]="abcd123";
		data[0][3]=23;
		
		//second row
		data[1][0]="Sai";
		data[1][1]="rithesh";
		data[1][2]="abcd1234";
		data[1][3]=6;
		
		return Arrays.asList(data);
	}
	
	@Test
	public void doLogin() {
		System.out.println(firstname+" - "+lastname+" - "+age);
	}

}
