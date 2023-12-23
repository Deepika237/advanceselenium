package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class car3 {
@Test(groups="smoke")

public void kia() {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.bmw.in/en/index.html");
	
}
}
