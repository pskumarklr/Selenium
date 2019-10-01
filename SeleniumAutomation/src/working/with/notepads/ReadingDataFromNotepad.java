package working.with.notepads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadingDataFromNotepad {

	public static void main(String[] args) throws Exception {
		
		File f = new File("C:\\Users\\skuma\\Desktop\\interview.txt"); 
		FileReader fr = new FileReader(f); 
		BufferedReader br = new BufferedReader(fr); 
		String l = br.readLine(); 
		while(l!= null){ 
			System.out.println(l);
			l = br.readLine(); 
		
		}
		

	}

}
