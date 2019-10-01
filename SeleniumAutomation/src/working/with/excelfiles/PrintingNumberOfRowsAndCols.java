package working.with.excelfiles;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class PrintingNumberOfRowsAndCols {

	public static void main(String[] args) throws BiffException, IOException {
		File f = new File("C:\\Users\\admin\\Desktop\\testdata.xls");
		Workbook wb = Workbook.getWorkbook(f); 
		Sheet ws = wb.getSheet(0);
		int nr = ws.getRows(); 
		System.out.println("number of rows is "+nr);
		
		int nc = ws.getColumns(); 
		System.out.println("number of columns is " +nc); 

	}

}
