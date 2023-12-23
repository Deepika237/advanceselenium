package Fethchingdataexcel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class rowcolumsize {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("exceldata/data2.xlsx");
		Workbook w = WorkbookFactory.create(fis);
		Sheet s = w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowsize);
		System.out.println(columnsize);
		for (int i = 0; i < rowsize; i++) {
			System.out.println();
			for (int j = 0; j < columnsize; j++) {

				String data = w.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue() + " ";
				System.out.print(data + " ");
			}
		}
	}
}
