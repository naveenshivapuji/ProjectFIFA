package selenium.testpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelectBackSpace extends BaseClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		driver.get("http://localhost:8080/login.do");
		WebElement unname = driver.findElement(By.id("username"));
		unname.sendKeys("admin");
		Actions action = new Actions(driver);
		action.doubleClick(unname).perform();
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
	}
}
