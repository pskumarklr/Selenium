package corejavaprograms;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
		Date d = new Date();  
		String dt = sdf.format(d);
		System.out.println(dt);  
		
		
	}

}
