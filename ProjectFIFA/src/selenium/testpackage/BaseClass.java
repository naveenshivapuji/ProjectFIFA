package selenium.testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	// Set the path of the relevant driver executable
	static {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}

	// Launch the Browser
	static WebDriver driver = new ChromeDriver();

}
