package working.with.notepads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToANotepad {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\skuma\\Desktop\\interview.txt");
        FileWriter fw = new FileWriter(f); 
        BufferedWriter bw = new BufferedWriter(fw); 
        bw.write("sunday");
        bw.newLine();
        bw.write("monday");
        bw.newLine(); 
        bw.write("tuesday");
        bw.close();
        fw.close();
        
        
 
	}

}
