package Fethchingdataexcel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream ("./exceldata/data.xlsx");
	Workbook xlsx=WorkbookFactory.create(fis);
	
	
	String data=xlsx.getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
	System.out.println(data);
}

}
