package selenium.testpackage;

import org.openqa.selenium.By;

public class IndependentDependentXpath extends BaseClass{

	public static void main(String[] args) {

		
//		driver.get("https://www.seleniumhq.org/");
		
		driver.get("https://www.seleniumhq.org/download/");
		
		driver.findElement(By.xpath("//td[text()='Java']/../td//a[text()='Download']")).click();
		
		String x = driver.findElement(By.xpath("//td[text()='Python']/following-sibling::td[text()]")).getText();
		
		System.out.println(x);
		
		
	}

}
