package Fethchingdataexcel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipledata {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("exceldata/data2.xlsx");
		Workbook xlsx = WorkbookFactory.create(fis);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				
				String data = xlsx.getSheet("sheet1").getRow(i).getCell(j).toString();

				System.out.print(data+"	");

			}
		System.out.println();

		}
	}
}
