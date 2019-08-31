package filehandling;

import java.io.IOException;

public class TestExcelsReader {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl=new Xls_Reader("H:\\automatiomdata\\automationrepository\\basiccorejava\\src\\filehandling\\Testdata.xls");
		
		int rows=xl.getRowCount("sheet1");
		int cols=xl.getColumnCount("sheet1");
		System.out.println(rows);
		System.out.println(cols);
		System.out.println(xl.getCellData("Sheet1",1,1));
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				System.out.print(xl.getCellData("Sheet1", r, c)+" ");
			}
			System.out.println();
		}
		

	}

}
