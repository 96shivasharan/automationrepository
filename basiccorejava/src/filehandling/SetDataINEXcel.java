package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class SetDataINEXcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String path="H:\\automatiomdata\\automationrepository\\basiccorejava\\src\\filehandling\\Testdata.xls";
		
		FileInputStream file =new FileInputStream(path);
		
		HSSFWorkbook wb=new HSSFWorkbook(file);
		
		HSSFSheet sheet=wb.getSheet	("sheet1");
		
		HSSFRow row=sheet.getRow(0);
		
		HSSFCell cell=row.getCell(0);

		cell.setCellValue("shiva");
		
		FileOutputStream fileout=new FileOutputStream(path);
		
		wb.write(fileout);
	}

}
