package selenium.testpackage;

import org.openqa.selenium.WebDriver.Navigation;

public class NavigationDemo extends BaseClass{

	public static void main(String[] args) throws InterruptedException{

		
		Navigation navigate = driver.navigate();
		navigate.to("http://www.facebook.com");
		
		Thread.sleep(3000);
		navigate.back();
		
		Thread.sleep(3000);
		navigate.forward();

		Thread.sleep(3000);
		navigate.refresh();
		
		Thread.sleep(3000);
		driver.close();
	}

}
