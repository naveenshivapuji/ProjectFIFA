package selenium.testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo extends BaseClass {
	public static void main(String[] args) throws AWTException {
		driver.get("http://localhost:8080/login.do");
		WebElement actiTIMEInc = driver.findElement(By.linkText("actiTIME Inc."));
		Actions action = new Actions(driver);
		action.contextClick(actiTIMEInc).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		driver.close();
		driver.quit();
	}
}
