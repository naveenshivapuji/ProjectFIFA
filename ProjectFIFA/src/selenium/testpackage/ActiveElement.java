package selenium.testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ActiveElement extends BaseClass {

	public static void main(String[] args) throws AWTException {
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("Goa beach");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}
}
