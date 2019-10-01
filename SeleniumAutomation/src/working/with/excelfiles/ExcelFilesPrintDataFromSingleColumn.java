package working.with.excelfiles;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFilesPrintDataFromSingleColumn {
		
	public static void main(String[] args) throws Exception {		 
            // create a file object for working on the file. 
	File f = new File("C:\\Users\\admin\\Desktop\\testdata.xls");

            // create an object for working on the workbook. 
	Workbook wb = Workbook.getWorkbook(f); 

            // create an object for working on the worksheet 
	Sheet ws = wb.getSheet(0);

            // get the no. of rows 
	int nr = ws.getRows();
	System.out.println("number of used rows is "+nr);


	for (int i = 1; i < nr; i++) { 
                    

		Cell x = ws.getCell(0,i);  // (column,row) 
		String y = x.getContents(); 
		System.out.println(y);
		
		
	}

	} 	
	
}
