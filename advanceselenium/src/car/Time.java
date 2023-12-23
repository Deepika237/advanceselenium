package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time {
@Test(timeOut=10000 )
public void Open() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.bmw.in/en/index.html");
}
}
