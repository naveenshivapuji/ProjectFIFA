package selenium.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassFirfox {
	
	// Set the path of the relevant driver executable
	static {
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
	}

	static WebDriver driver = new FirefoxDriver();

}
