package Assertion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertequal {
	@Test
	public void testCase() {
		// testdata
		String Expected = "https://demowebshop.tricentis.com/";
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String Actual = driver.getCurrentUrl();
		Assert.assertEquals(Expected, Actual);
		Reporter.log("test case completed", true);
	}
}
