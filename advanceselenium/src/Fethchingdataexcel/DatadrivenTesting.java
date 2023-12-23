package Fethchingdataexcel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenTesting {
@DataProvider(name="exceldata")
public Object[][] data(){
	Object[][]d=new Object[2][2];
	d[0][0]="username1";
	d[0][1]="password1";
	d[1][0]="username2";
	d[1][1]="password2";
	return d;
}
@Test(dataProvider="exceldata")
public void m1(String user,String password) {
	System.out.println(user);
	System.out.println(password);
}
}
//for login module we are using data driven testing
//manually