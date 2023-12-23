package seleniumbatch;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
@BeforeSuite
public void ConnectServer() {
	Reporter.log("connecting to the server",true);
}
	@BeforeTest
public void ConnectDatabase() {
	Reporter.log("connecting to the database",true);
}
	@BeforeClass
	public void open() {
		Reporter.log("open the browser",true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login to the browser",true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from the browser",true);
	}
	@AfterClass
	public void close() {
		Reporter.log("close the browser",true);
	}
	@AfterTest
	public void disconnectDatabase() {
		Reporter.log("disconnecting from the database",true);
	}
	@AfterSuite
	public void disconnectServer() {
		Reporter.log("disconnecting to the server",true);
	}
	
}
