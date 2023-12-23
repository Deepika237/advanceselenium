package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	@Test(priority = 3, enabled = false)//it will not execute amazon if we give true then it will execute
	public void login() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
	}

	@Test(priority = 2)
	public void register() {
		Reporter.log("passing", true);
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.royalchallengers.com");
	}

	@Test(priority = 1)
	public void logout() {
		Reporter.log("yepp", true);
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
