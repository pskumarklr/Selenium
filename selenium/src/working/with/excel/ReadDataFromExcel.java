package working.with.excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main (String [] args) throws IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\skuma\\Desktop\\santhu.xlsx");
		XSSFWorkbook workbook= new XSSFWorkbook(f1);
		XSSFSheet sheet = workbook.getSheetAt(0);
		 
		
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(1);
				System.out.println(cell);
				
		System.out.println(sheet.getRow(2).getCell(1));
				
		

		
		
		
		
		
	}

}
