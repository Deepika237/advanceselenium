package CrossBrowserTesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class testcase extends BaseClass {
	
	@Test
	public void testcse() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("deepu995@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9090386005@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}

}
