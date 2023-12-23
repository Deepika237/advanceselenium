package Pageobjectmodel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testdemo {
@Test(dataProvider="exceldata")
public void getRegister(String fname,String lname,String email, String pass,String compas) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Homepage h=new Homepage(driver);
	h.getRegisterlink().click();
	RegisterPage r=new RegisterPage(driver);
	r.getGender().click();
	r.getFirstname().sendKeys(fname);
	r.getLastname().sendKeys(lname);
	r.getEmail().sendKeys(email);
	r.getPassword().sendKeys(pass);
	r.getConfirmpassword().sendKeys(compas);
	r.getRegisterbutton().click();
	LogoutPage lo=new LogoutPage(driver);
	lo.getLogoutlink().click();
	h.getloginlink().click();
	Loginpage log=new Loginpage(driver);
	log.getEmail().sendKeys(email);
	log.getPassword().sendKeys(pass);
	log.getLoginbutton().click();
	
}
@DataProvider(name="exceldata")
public Object[][]testdata() throws IOException{
FileInputStream fis=new FileInputStream("exceldata/data4.xlsx");
Workbook w=WorkbookFactory.create(fis);
Sheet s= w.getSheet("data");
int rowsize = s.getPhysicalNumberOfRows();
int columnsize = s.getRow(0).getPhysicalNumberOfCells();
Object [][]d=new Object[rowsize-1][columnsize];
for (int i = 0; i < rowsize-1; i++) {
	for (int j = 0; j < columnsize; j++) {
		d[i][j]=s.getRow(i+1).getCell(j).toString();
	}
}
return d;
}
}
