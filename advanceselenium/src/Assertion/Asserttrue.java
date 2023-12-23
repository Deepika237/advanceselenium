package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Asserttrue {
	@Test
	public void testCase() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("//input[@id='pollanswers-1']")).click();
		boolean radio = driver.findElement(By.xpath("//input[@id='pollanswers-1']")).isSelected();
		Assert.assertTrue(radio);
	}
}
//or
//assert.assertFalse(radio)
//validation command:-
//IsSelected,,IsEnabled,,IsDisplayed