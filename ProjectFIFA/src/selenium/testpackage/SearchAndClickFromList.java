package selenium.testpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class SearchAndClickFromList extends BaseClass{

	public static void main(String[] args) throws InterruptedException {

		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("lst-ib")).sendKeys("Goa");
		Thread.sleep(3000);
		
		List<WebElement> linkSearch = driver.findElements(By.xpath("//*[contains(text(),'goa')]"));
		System.out.println(linkSearch.size());
		
		for (WebElement link : linkSearch) {
			
			String text = link.getText();
			System.out.println(text);
			if (text.equals("goa hotels"))
				link.click();
		}
	}
}
