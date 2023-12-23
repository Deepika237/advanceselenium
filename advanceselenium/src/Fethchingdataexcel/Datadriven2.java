package Fethchingdataexcel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven2 {
	@DataProvider(name="exceldata")
	public Object[][] data() throws IOException{
	FileInputStream f=new FileInputStream("exceldata/data2.xlsx");
	Workbook w=WorkbookFactory.create(f);
	Sheet s= w.getSheet("sheet1");
	int rowsize = s.getPhysicalNumberOfRows();
	int columnsize = s.getRow(0).getPhysicalNumberOfCells();
	Object [][]d=new Object[rowsize][columnsize];
	for (int i = 0; i < rowsize; i++) {
		for (int j = 0; j < columnsize; j++) {
			d[i][j]=s.getRow(i).getCell(j).toString();
		}
	}
	return d;
	
}
	@Test(dataProvider="exceldata")
	public void m1(String user,String password) {
		System.out.println(user);
		System.out.println(password);
	}
}
//if we dont want to print trainer name and subject den
//Object [][]d=new Object[rowsize-1][columnsize];
//for (int i = 0; i < rowsize-1; i++) 
	//d[i][j]=s.getRow(i+1).getCell(j).toString();