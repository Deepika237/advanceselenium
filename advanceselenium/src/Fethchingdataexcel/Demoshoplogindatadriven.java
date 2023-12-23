package Fethchingdataexcel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demoshoplogindatadriven {
	WebDriver driver;

	@Test(priority = 1)
	public void accessBrowser() {
		ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	}

	@DataProvider(name = "exceldata")
	public Object[][] data() throws IOException {
		FileInputStream f = new FileInputStream("exceldata/data3.1.xlsx");
		Workbook w = WorkbookFactory.create(f);
		Sheet s = w.getSheet("sheet1");
		int rowsize = s.getPhysicalNumberOfRows();
		int columnsize = s.getRow(0).getPhysicalNumberOfCells();
		System.out.println(rowsize);
		System.out.println(columnsize);
		Object[][] d = new Object[rowsize-1][columnsize];
		for (int i = 0; i < rowsize-1; i++) {
			for (int j = 0; j < columnsize; j++) {
				d[i][j] = s.getRow(i+1).getCell(j).toString();
			}
		}
		return d;
	}

	@Test(dataProvider = "exceldata")
	public void login(String email, String password) {
	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}
		
/*public void register(String fname,String lname,String email,String pwd,String cpwd) {
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("gender-female")).click();
driver.findElement(By.id("FirstName")).sendKeys("fname");
driver.findElement(By.id("LastName")).sendKeys("lname");
driver.findElement(By.id("Email")).sendKeys("email");
driver.findElement(By.id("Password")).sendKeys("pwd");
driver.findElement(By.name("ConfirmPassword")).sendKeys("cpwd");
driver.findElement(By.id("register-button")).click();}*/
}
