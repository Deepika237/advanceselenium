package Assertion;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotequalTo {
	@Test
	public void testcase() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		String BeforeRegister = driver.findElement(By.linkText("Register")).getText();

		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shikha");
		driver.findElement(By.id("LastName")).sendKeys("patel");
		driver.findElement(By.id("Email")).sendKeys("deepu1995@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9090386005@");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("9090386005@");
		driver.findElement(By.id("register-button")).click();
		String Afterregister = driver.findElement(By.xpath("//a[text()='deepu1995@gmail.com']")).getText();
		Assert.assertNotEquals(BeforeRegister, Afterregister);
	}
}
