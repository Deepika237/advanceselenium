package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation {
	@Test(priority = 1,invocationCount = 3)
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 3,invocationCount = 2)
	public void register() {
		Reporter.log("passing",true);
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.royalchallengers.com");
	}
	@Test(priority = 1,invocationCount = 2)
	public void logout() {
		Reporter.log("yepp",true);
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
//to execute a test case again and again instead of using for loop we use //helper attribute=invocationCount.