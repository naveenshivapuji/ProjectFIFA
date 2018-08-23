package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverDemo extends BaseClass{
	public static void main(String[] args) {
		driver.get("http://www.istqb.in/");
		Actions actions = new Actions(driver);
		WebElement foundationObj = driver.findElement(By.linkText("FOUNDATION"));
		actions.moveToElement(foundationObj).perform();
	}
}
