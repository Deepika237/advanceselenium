package bike;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bike2 {
@Test(groups="smoke")
public void royalenfield() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.royalenfield.com/in/en/home/");
}
}
