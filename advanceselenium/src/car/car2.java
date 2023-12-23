package car;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class car2 {
@Test (dependsOnGroups="smoke")
public void maruti() {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.marutisuzuki.com/swift");
}
}
