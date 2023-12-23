package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Threadpoolsize {
	@Test(invocationCount = 3, threadPoolSize = 2)
	public void login() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
	}


}
