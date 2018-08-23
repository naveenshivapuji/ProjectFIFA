package selenium.testpackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ListLinks extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		driver.get("http://localhost:8080/login.do");
		List<WebElement> allLinkObj = driver.findElements(By.tagName("a"));
		int noOfLinks = allLinkObj.size();
		System.out.println("Number of links : " + noOfLinks);
		for (WebElement link : allLinkObj) {
			String text = link.getText();
			System.out.println(text);
			if (text.equals("View License")) {
				Thread.sleep(3000);
				link.click();
			}
		}
	}
}
