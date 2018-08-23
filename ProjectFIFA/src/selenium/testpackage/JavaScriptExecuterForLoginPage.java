package selenium.testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecuterForLoginPage extends BaseClass {

	public static void main(String[] args) {

		driver.get("http://localhost:8080/login.do");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("document.getElementById('username').value = 'admin'");

		js.executeScript("document.getElementsByName('pwd')[0].value = 'manager'");

		WebElement loginBtnObj = driver.findElement(By.xpath("//div[text() = 'Login ']"));
		js.executeScript("arguments[0].click()", loginBtnObj);
	}

}
