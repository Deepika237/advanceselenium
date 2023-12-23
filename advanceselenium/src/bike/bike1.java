package bike;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class bike1 {
@Test(groups="smoke")
public void r15() {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.bikewale.com/yamaha-bikes/r15/");
}
}
