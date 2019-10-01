package working.with.excelfiles;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WritingToExcel {

	public static void main(String[] args) throws RowsExceededException, WriteException, IOException {
		File f = new File("D:\\testdataQedge.xls"); 
		WritableWorkbook wwb = Workbook.createWorkbook(f); 
		WritableSheet wws = wwb.createSheet("Writing",0);  
		Label un = new Label(0,0,"username"); 
		wws.addCell(un);
		Label pw = new Label(1,0,"password"); 
		wws.addCell(pw);
		Label rs = new Label(2,0,"result"); 
		wws.addCell(rs);
		wwb.write();
		wwb.close();

	}

}
