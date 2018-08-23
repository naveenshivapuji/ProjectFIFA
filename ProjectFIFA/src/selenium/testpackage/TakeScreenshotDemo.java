package selenium.testpackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshotDemo extends BaseClass {

	public static void main(String[] args) throws IOException {

		driver.get("http://www.facebook.com");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcsnapshot = ts.getScreenshotAs(OutputType.FILE);
		File destsnapshot = new File("./snapshots/facebook.png");
		FileUtils.copyFile(srcsnapshot, destsnapshot);
		
		driver.close();

	}

}
