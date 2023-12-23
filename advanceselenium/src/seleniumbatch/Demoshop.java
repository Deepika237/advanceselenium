package seleniumbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoshop {
	public WebDriver driver;

	@Test(priority = 1)
	public void register() {
		driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("deepika");
		driver.findElement(By.id("LastName")).sendKeys("panda");
		driver.findElement(By.id("Email")).sendKeys("deepika19967@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("9090386005@");
		driver.findElement(By.name("ConfirmPassword")).sendKeys("9090386005@");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("deepika19967@gmail.com")).isDisplayed();

	}

	@Test(dependsOnMethods = "logout", priority = 3)
	public void login() {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.name("Email")).sendKeys("deepika19967@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("9090386005@");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}

	@Test(priority=2)
	public void logout() {
		

		driver.findElement(By.linkText("Log out")).click();
	}

}
