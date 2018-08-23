package selenium.testpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class SeleniumGrid {

	@Parameters({"node","browser"})
	@Test
	public void testInMultipleOS(String node, String browser) throws MalformedURLException {
		
		System.out.println(node+ " : "+browser);

		URL whichSystem = new URL(node);

		DesiredCapabilities whichBrowser = new DesiredCapabilities();

		whichBrowser.setBrowserName(browser);

		WebDriver driver = new RemoteWebDriver(whichSystem, whichBrowser);

		driver.get("http://localhost:8080/login.do");

	}

}