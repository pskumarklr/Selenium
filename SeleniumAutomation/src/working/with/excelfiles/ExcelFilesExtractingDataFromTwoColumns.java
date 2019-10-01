package working.with.excelfiles;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFilesExtractingDataFromTwoColumns {

	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("C:\\Users\\admin\\Desktop\\testdata.xls");
		Workbook wb = Workbook.getWorkbook(f); 
		Sheet ws = wb.getSheet(0);
		int nr = ws.getRows();
		int nc = ws.getColumns(); 
		
		for(int i = 1; i < nr; i++) {
		
		    for(int j = 0; j < nc; j++) {   
			
				Cell x = ws.getCell(j,i);
				String y = x.getContents(); 
				System.out.println(y);
			
				
			}
	

	}

	} 		
}
