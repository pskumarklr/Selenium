package working.with.excelfiles;

import java.io.File;
import java.io.IOException;
import java.sql.BatchUpdateException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
 

import com.google.common.collect.Table.Cell;


public class DataFromMultipleSheets {

	public static void main(String[] args) throws BatchUpdateException, IOException {
		File f = new File("C:\\Users\\skuma\\Desktop\\Guru.xls");
		Workbook wb = Workbook.getWorkbook(f); 
		int k = wb.getNumberOfSheets(); 
		for(int ns = 0; ns<k; ns++)  
		{ 
		System.out.println(" u r in sheet "+(ns+1));
		System.out.println("......................");
		Sheet ws = wb.getSheet(ns);
		int nr = ws.getRows(); 
		System.out.println("number of rows is "+nr);
		
		int nc = ws.getColumns(); 
		System.out.println("number of columns is " +nc); 
		for (int j = 0; j < nc; j++) {   
			
			for (int i = 0; i < nr; i++) { 
				Cell x = ws.getCell(j,i);
				String y = x.getContents(); 
				System.out.println(y);
				
			} 
			
		} 
		
		} 

	}

}
