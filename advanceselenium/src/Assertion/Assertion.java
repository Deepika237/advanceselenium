package Assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertion {
	@Test
	public void testCase() {
		String Expected = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Actual = driver.getCurrentUrl();
		Assert.assertEquals(Expected, Actual);
		Reporter.log("testcase completed", true);

	}
}
//hardassert
//assertequals