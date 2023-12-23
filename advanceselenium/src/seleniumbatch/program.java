package seleniumbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class program {


	@Test(priority = 3)
	public void login() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	}
	@Test(priority = 2)
	public void register() {
		Reporter.log("passing",true);
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.royalchallengers.com");
	}
	@Test(priority = 1)
	public void logout() {
		Reporter.log("yepp",true);
ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
//if we donot give priority then the output will came in alphabetical order
//if we gave priority then it will came as per that
//if we give same priority to every method then also it will came alphabetical order
//to execute based on our priority which one execute 1st and which one execute last we use helper attribute of @test  priority)